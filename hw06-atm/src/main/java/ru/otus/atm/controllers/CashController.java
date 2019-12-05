package ru.otus.atm.controllers;

import ru.otus.atm.constants.CashType;
import ru.otus.atm.constants.DrawStatus;
import ru.otus.atm.exceptions.ATMException;
import ru.otus.atm.interfaces.IATM;
import ru.otus.atm.interfaces.Currency;
import ru.otus.atm.models.BankNote;

import java.util.Comparator;
import java.util.TreeMap;

public class CashController implements IATM {

    private TreeMap<CashType, Currency> bankNotesBankByType = new TreeMap<>(Comparator.reverseOrder());

    @Override
    public void insert(Currency cash) {

        if (!bankNotesBankByType.containsKey(cash.getType())) {
            bankNotesBankByType.put(cash.getType(), cash);
            return;
        }

        Currency bankNotesBank = bankNotesBankByType.get(cash.getType());
        bankNotesBank.setAmount(bankNotesBank.getAmount() + cash.getAmount());
    }

    private boolean isMultipliable(Long amount) {

        for (Currency banknoteBank : this.bankNotesBankByType.values()) {

            long banknoteCount = amount / banknoteBank.getType().getCashMultiplier();
            amount -= (banknoteCount > banknoteBank.getAmount() ? banknoteBank.getAmount() : banknoteCount) * banknoteBank.getType().getCashMultiplier();

            if (amount == 0)
                return true;
        }

        return false;
    }

    public TreeMap<CashType, Currency> draw(Long amount) throws ATMException {

        if (getTotal() < amount) {
            throw new ATMException(DrawStatus.NOT_ENOUGH_MONEY);
        }

        boolean isMultipliable = this.isMultipliable(amount);

        if (!isMultipliable) {
            throw new ATMException(DrawStatus.WRONG_MULTIPLIER_REQUESTED);
        }

        TreeMap<CashType, Currency> drawnBanknotes = new TreeMap<>();

        for (Currency banknoteBank : this.bankNotesBankByType.values()) {

            long neededBanknoteCount = amount / banknoteBank.getType().getCashMultiplier();
            Long realBanknoteCount = neededBanknoteCount > banknoteBank.getAmount() ? banknoteBank.getAmount() : neededBanknoteCount;
            amount -= realBanknoteCount * banknoteBank.getType().getCashMultiplier();

            banknoteBank.setAmount(banknoteBank.getAmount() - realBanknoteCount);

            drawnBanknotes.put(banknoteBank.getType(), new BankNote(banknoteBank.getType(), neededBanknoteCount));

            if (amount == 0)
                return drawnBanknotes;
        }


        return drawnBanknotes;
    }

    public Long getTotal() {
        return this.bankNotesBankByType.values().stream()
                .map(bankNotesBank -> bankNotesBank.getAmount() * bankNotesBank.getType().getCashMultiplier())
                .reduce(0L, Long::sum);
    }

}

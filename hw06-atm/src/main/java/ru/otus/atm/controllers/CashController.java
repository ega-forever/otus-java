package ru.otus.atm.controllers;

import ru.otus.atm.interfaces.Currency;

import java.util.Comparator;
import java.util.TreeMap;

public class CashController {

    private TreeMap<Long, Currency> bankNotesBankByType = new TreeMap<>(Comparator.reverseOrder());

    public void insert(Currency cash) {

        if (!bankNotesBankByType.containsKey(cash.multiplier())) {
            bankNotesBankByType.put(cash.multiplier(), cash);
            return;
        }

        Currency bankNotesBank = bankNotesBankByType.get(cash.multiplier());
        bankNotesBank.setAmount(bankNotesBank.getAmount() + cash.getAmount());
    }

    private boolean isMultipliable(Long amount) {

        for (Currency banknoteBank : this.bankNotesBankByType.values()) {

            long banknoteCount = amount / banknoteBank.multiplier();
            amount -= (banknoteCount > banknoteBank.getAmount() ? banknoteBank.getAmount() : banknoteCount) * banknoteBank.multiplier();

            if (amount == 0)
                return true;
        }

        return false;
    }

    public boolean draw(Long amount) {

        boolean isMultipliable = this.isMultipliable(amount);

        if (!isMultipliable) {
            return false;
        }

        for (Currency banknoteBank : this.bankNotesBankByType.values()) {

            long neededBanknoteCount = amount / banknoteBank.multiplier();
            Long realBanknoteCount = neededBanknoteCount > banknoteBank.getAmount() ? banknoteBank.getAmount() : neededBanknoteCount;
            amount -= realBanknoteCount * banknoteBank.multiplier();

            banknoteBank.setAmount(banknoteBank.getAmount() - realBanknoteCount);

            if (amount == 0)
                return true;
        }


        return false;
    }

    public Long getTotal() {
        return this.bankNotesBankByType.values().stream()
                .map(bankNotesBank -> bankNotesBank.getAmount() * bankNotesBank.multiplier())
                .reduce(0L, Long::sum);
    }

    public TreeMap<Long, Long> getTotalByMultiplier() {

        TreeMap<Long, Long> banknotesByMultiplier = new TreeMap<>(Comparator.reverseOrder());

        for (Currency banknoteBank : this.bankNotesBankByType.values()) {
            banknotesByMultiplier.put(banknoteBank.multiplier(), banknoteBank.getAmount() * banknoteBank.multiplier());
        }

        return banknotesByMultiplier;
    }

}

package ru.otus.atm;

import ru.otus.atm.constants.CashType;
import ru.otus.atm.constants.DrawStatus;
import ru.otus.atm.exceptions.ATMException;
import ru.otus.atm.interfaces.BankCell;
import ru.otus.atm.models.BankCellImpl;

import java.util.Comparator;
import java.util.TreeMap;

public class ATM implements ru.otus.atm.interfaces.ATM {

    private TreeMap<CashType, BankCell> bankNotesCellsByType = new TreeMap<>(Comparator.reverseOrder());

    @Override
    public void insert(CashType type, Long amount) {

        if (!bankNotesCellsByType.containsKey(type)) {
            BankCell cell = new BankCellImpl(type, amount);
            bankNotesCellsByType.put(type, cell);
            return;
        }

        BankCell cell = bankNotesCellsByType.get(type);
        cell.setAmount(cell.getAmount() + amount);
    }

    private boolean isMultipliable(Long amount) {

        for (BankCell cell : this.bankNotesCellsByType.values()) {

            long banknoteCount = amount / cell.getType().getCashMultiplier();
            amount -= (banknoteCount > cell.getAmount() ? cell.getAmount() : banknoteCount) * cell.getType().getCashMultiplier();

            if (amount == 0)
                return true;
        }

        return false;
    }

    @Override
    public TreeMap<CashType, Long> draw(Long amount) throws ATMException {

        if (getTotal() < amount) {
            throw new ATMException(DrawStatus.NOT_ENOUGH_MONEY);
        }

        boolean isMultipliable = this.isMultipliable(amount);

        if (!isMultipliable) {
            throw new ATMException(DrawStatus.WRONG_MULTIPLIER_REQUESTED);
        }

        TreeMap<CashType, Long> drawnBanknotes = new TreeMap<>();

        for (BankCell cell : this.bankNotesCellsByType.values()) {

            long neededBanknoteCount = amount / cell.getType().getCashMultiplier();
            Long realBanknoteCount = neededBanknoteCount > cell.getAmount() ? cell.getAmount() : neededBanknoteCount;
            amount -= realBanknoteCount * cell.getType().getCashMultiplier();

            cell.setAmount(cell.getAmount() - realBanknoteCount);

            drawnBanknotes.put(cell.getType(), neededBanknoteCount);

            if (amount == 0)
                return drawnBanknotes;
        }


        return drawnBanknotes;
    }

    public Long getTotal() {
        return this.bankNotesCellsByType.values().stream()
                .map(bankNotesBank -> bankNotesBank.getAmount() * bankNotesBank.getType().getCashMultiplier())
                .reduce(0L, Long::sum);
    }

}

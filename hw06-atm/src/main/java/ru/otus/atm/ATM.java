package ru.otus.atm;

import ru.otus.atm.constants.CashType;
import ru.otus.atm.constants.DrawStatus;
import ru.otus.atm.controllers.CashController;
import ru.otus.atm.exceptions.ATMException;
import ru.otus.atm.interfaces.Currency;
import ru.otus.atm.interfaces.IATM;
import ru.otus.atm.models.BankNote;

import java.util.TreeMap;

public class ATM {

    public static void main(String args[]) {


        IATM cashController = new CashController();

        BankNote tenBankNotes = new BankNote(CashType.TEN_RUBLES, 1L);
        BankNote fiftyBankNotes = new BankNote(CashType.FIFTY_RUBLES, 20L);
        BankNote hundredBankNotes = new BankNote(CashType.HUNDRED_RUBLES, 5L);

        cashController.insert(tenBankNotes);
        cashController.insert(fiftyBankNotes);
        cashController.insert(hundredBankNotes);

        Long currentTotal = cashController.getTotal();

        try {
            Long drawSum = 760L;
            TreeMap<CashType, Currency> banknotes = cashController.draw(drawSum);
            System.out.println(banknotes);

            Long newAmount = cashController.getTotal();
            System.out.println("sum before draw: " + currentTotal);
            System.out.println("sum after draw: " + newAmount);
            System.out.println("draw amount: " + drawSum);

        } catch (ATMException e) {
            System.out.println("draw failed. Reason: " + e.toString());
        }

    }


}

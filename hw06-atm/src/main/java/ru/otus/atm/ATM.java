package ru.otus.atm;

import ru.otus.atm.controllers.CashController;
import ru.otus.atm.models.FiftyRubleBankNote;
import ru.otus.atm.models.HundredRubleBankNote;
import ru.otus.atm.models.TenRubleBankNote;

public class ATM {

    public static void main(String args[]) {


        CashController cashController = new CashController();

        TenRubleBankNote tenRubleBankNotes = new TenRubleBankNote(1L);
        FiftyRubleBankNote fiftyRubleBankNotes = new FiftyRubleBankNote(20L);
        HundredRubleBankNote hundredRubleBankNotes = new HundredRubleBankNote(5L);

        cashController.insert(tenRubleBankNotes);
        cashController.insert(fiftyRubleBankNotes);
        cashController.insert(hundredRubleBankNotes);

        Long currentTotal = cashController.getTotal();
        Long drawSum = 760L;

        boolean isDrawn = cashController.draw(drawSum);
        Long newAmount = cashController.getTotal();

        assert isDrawn && currentTotal - 760L == newAmount;
    }


}

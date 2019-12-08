package ru.otus.main;

import ru.otus.atm.ATM;
import ru.otus.atm.constants.CashType;
import ru.otus.atm.exceptions.ATMException;

import java.util.TreeMap;

public class Starter {

    public static void main(String args[]){

        ATM instance = new ATM();

        instance.insert(CashType.TEN_RUBLES, 1L);
        instance.insert(CashType.FIFTY_RUBLES, 20L);
        instance.insert(CashType.HUNDRED_RUBLES, 5L);

        Long currentTotal = instance.getTotal();

        try {
            Long drawSum = 760L;
            TreeMap<CashType, Long> banknotes = instance.draw(drawSum);
            System.out.println(banknotes);

            Long newAmount = instance.getTotal();
            System.out.println("sum before draw: " + currentTotal);
            System.out.println("sum after draw: " + newAmount);
            System.out.println("draw amount: " + drawSum);

        } catch (ATMException e) {
            System.out.println("draw failed. Reason: " + e.toString());
        }

    }

}

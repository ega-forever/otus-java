package ru.otus.main;

import ru.otus.atm.constants.CashType;
import ru.otus.atm.interfaces.ATM;
import ru.otus.department.DepartmentImpl;
import ru.otus.department.interfaces.Department;

public class Starter {

    public static void main(String[] args){

        Department department = new DepartmentImpl();

        ATM atm1 = department.createATM();
        ATM atm2 = department.createATM();

        atm1.insert(CashType.FIFTY_RUBLES, 20L);
        atm1.insert(CashType.TEN_RUBLES, 10L);
        Long atm1Total = atm1.getTotal();


        atm2.insert(CashType.HUNDRED_RUBLES, 15L);
        atm2.insert(CashType.TEN_RUBLES, 30L);
        Long atm2Total = atm2.getTotal();

        System.out.println("atm(1) before drop: " + atm1Total);
        System.out.println("atm(2) before drop: " + atm2Total);

        department.dropAllATMState();

        Long atm1TotalNew = atm1.getTotal();
        Long atm2TotalNew = atm2.getTotal();

        System.out.println("atm(1) after drop: " + atm1TotalNew);
        System.out.println("atm(2) after drop: " + atm2TotalNew);

    }


}

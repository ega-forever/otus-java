package ru.otus.department.interfaces;

import ru.otus.atm.interfaces.ATM;

public interface Department {
    Long totalLeft();
    void dropAllATMState();
    ATM createATM();
}

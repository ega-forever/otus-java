package ru.otus.department.interfaces;

import ru.otus.atm.interfaces.ATM;

public interface State {

    void save();
    void rollback();
    int length();
    ATM getATM();
}

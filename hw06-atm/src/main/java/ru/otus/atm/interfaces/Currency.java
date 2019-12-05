package ru.otus.atm.interfaces;

import ru.otus.atm.constants.CashType;

public interface Currency {
    Long getAmount();
    void setAmount(Long amount);
    CashType getType();


}

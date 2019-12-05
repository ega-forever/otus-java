package ru.otus.atm.models;

import ru.otus.atm.constants.CashType;
import ru.otus.atm.interfaces.Currency;

public class BankNote implements Currency {

    private Long amount = 0L;
    private CashType cashType;

    public BankNote(CashType cashType) {
        this.cashType = cashType;
    }

    public BankNote(CashType cashType, Long amount) {
        this.cashType = cashType;
        this.amount = amount;
    }

    @Override
    public Long getAmount() {
        return amount;
    }

    @Override
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    @Override
    public CashType getType() {
        return this.cashType;
    }

}

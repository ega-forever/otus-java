package ru.otus.atm.models;

import ru.otus.atm.constants.CashType;

public class BankCellImpl implements ru.otus.atm.interfaces.BankCell {

    private Long amount = 0L;
    private CashType cashType;

    public BankCellImpl(CashType cashType) {
        this.cashType = cashType;
    }

    public BankCellImpl(CashType cashType, Long amount) {
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

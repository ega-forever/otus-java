package ru.otus.atm.models;

import ru.otus.atm.interfaces.Currency;

public class HundredRubleBankNote implements Currency {

    private Long amount = 0L;

    public HundredRubleBankNote(){ }

    public HundredRubleBankNote(Long amount){
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
    public Long multiplier() {
        return 100L;
    }

}

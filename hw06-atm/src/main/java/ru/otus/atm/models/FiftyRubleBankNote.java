package ru.otus.atm.models;

import ru.otus.atm.interfaces.Currency;

public class FiftyRubleBankNote implements Currency {

    private Long amount = 0L;

    public FiftyRubleBankNote(){ }

    public FiftyRubleBankNote(Long amount){
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
        return 50L;
    }

}

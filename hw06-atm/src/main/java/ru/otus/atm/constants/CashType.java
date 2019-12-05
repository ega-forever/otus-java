package ru.otus.atm.constants;

public enum CashType {

    TEN_RUBLES(10),
    FIFTY_RUBLES(50),
    HUNDRED_RUBLES(100);

    private int cashMultiplier;

    CashType(int cashMultiplier) {
        this.cashMultiplier = cashMultiplier;
    }

    public int getCashMultiplier() {
        return cashMultiplier;
    }


}

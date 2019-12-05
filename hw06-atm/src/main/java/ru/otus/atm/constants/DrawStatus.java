package ru.otus.atm.constants;

public enum DrawStatus {

    SUCCESS(0),
    NOT_ENOUGH_MONEY(1),
    WRONG_MULTIPLIER_REQUESTED(2);

    private int status;

    DrawStatus(int status){
        this.status = status;
    }


    public int getStatus() {
        return status;
    }
}

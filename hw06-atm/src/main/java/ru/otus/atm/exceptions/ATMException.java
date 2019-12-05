package ru.otus.atm.exceptions;

import ru.otus.atm.constants.DrawStatus;

public class ATMException extends Exception {

    private DrawStatus drawStatus;

    public ATMException(DrawStatus status){
        super(status.name());
        this.drawStatus = status;
    }

    public int statusCode (){
        return this.drawStatus.getStatus();
    }

}

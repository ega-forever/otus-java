package ru.otus.department.proxy;

import ru.otus.atm.constants.CashType;
import ru.otus.atm.exceptions.ATMException;
import ru.otus.atm.interfaces.ATM;
import ru.otus.department.interfaces.State;

import java.util.TreeMap;

public class ATMProxy implements ATM {

    State state;

    public ATMProxy(State state) {
        this.state = state;
    }

    @Override
    public void insert(CashType cash, Long amount) {
        this.state.getATM().insert(cash, amount);
        this.state.save();
    }

    @Override
    public Long getTotal() {
        return this.state.getATM().getTotal();
    }

    @Override
    public TreeMap<CashType, Long> draw(Long amount) throws ATMException {
        TreeMap<CashType, Long> cashTypeLongTreeMap = this.state.getATM().draw(amount);
        this.state.save();
        return cashTypeLongTreeMap;
    }

    @Override
    public TreeMap<CashType, Long> getTotalByType() {
        return this.state.getATM().getTotalByType();
    }

    @Override
    public void reset() {
        while (this.state.length() != 0) {
            this.state.rollback();
        }


    }
}

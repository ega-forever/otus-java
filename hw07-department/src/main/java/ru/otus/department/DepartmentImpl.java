package ru.otus.department;

import ru.otus.atm.ATMImpl;
import ru.otus.atm.interfaces.ATM;
import ru.otus.department.interfaces.Department;
import ru.otus.department.interfaces.State;
import ru.otus.department.proxy.ATMProxy;

import java.util.ArrayList;
import java.util.List;

public class DepartmentImpl implements Department {

    List<State> states = new ArrayList<>();


    @Override
    public ATM createATM() {
        ATM atm = new ATMImpl();
        State state = new StateImpl(atm);
        this.states.add(state);
        return new ATMProxy(state);
    }

    public Long totalLeft() {
        return this.states.stream()
                .map(state -> state.getATM().getTotal())
                .reduce(0L, Long::sum);
    }

    public void dropAllATMState() {

        for(State state: this.states){
            while(state.length() != 0){
                state.rollback();
            }

        }


    }
}

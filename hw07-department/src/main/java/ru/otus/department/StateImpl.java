package ru.otus.department;

import ru.otus.atm.constants.CashType;
import ru.otus.atm.interfaces.ATM;
import ru.otus.department.interfaces.State;

import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class StateImpl implements State {

    Stack<TreeMap<CashType, Long>> stack = new Stack<>();
    ATM atm;

    public StateImpl(ATM atm) {
        this.atm = atm;
        this.stack.push(atm.getTotalByType());
    }

    @Override
    public void save() {
        stack.push(atm.getTotalByType());
    }

    @Override
    public void rollback() {
        TreeMap<CashType, Long> cashTypeLongTreeMap = this.stack.pop();
        atm.reset();

        for (Map.Entry<CashType, Long> entry : cashTypeLongTreeMap.entrySet()) {
            atm.insert(entry.getKey(), entry.getValue());
        }


    }

    @Override
    public int length() {
        return this.stack.size();
    }

    @Override
    public ATM getATM() {
        return this.atm;
    }
}

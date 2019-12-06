package ru.otus.atm.interfaces;

import ru.otus.atm.constants.CashType;
import ru.otus.atm.exceptions.ATMException;

import java.util.TreeMap;

public interface ATM {

    /** insert some cash **/
    void insert(CashType cash, Long amount);

    /** get total left balance **/
    public Long getTotal();

    /** draw some money
     * @return**/
    public TreeMap<CashType, Long> draw(Long amount) throws ATMException;

}

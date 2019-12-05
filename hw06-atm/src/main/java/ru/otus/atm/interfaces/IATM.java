package ru.otus.atm.interfaces;

import ru.otus.atm.constants.CashType;
import ru.otus.atm.exceptions.ATMException;

import java.util.TreeMap;

public interface IATM {

    /** insert some cash **/
    void insert(Currency cash);

    /** get total left balance **/
    public Long getTotal();

    /** draw some money
     * @return**/
    public TreeMap<CashType, Currency> draw(Long amount) throws ATMException;

}

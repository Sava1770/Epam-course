package model;

import entity.Bank;
import entity.Currency;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Savostin Roman
 * class for filling list of banks
 */
public class BankRepository {

    /** creating list of banks */
    private List<Bank> banks = new ArrayList<>();
    private List<Currency> currencies = new ArrayList<>();

    /**
     * constructor for filling list
     */
    public BankRepository(){
        setUp();
    }

    public void setUp(){
        banks.add(new Bank("Privat",12, true, 1, true));
        banks.add(new Bank("Monobank",11, true, 2, true));
        banks.add(new Bank("Oschad",15, false, 0, false));
        banks.add(new Bank("Raiffaisen",13, true, 1, false));

        currencies.add(new Currency("Dollar",13,14,15,12));
        currencies.add(new Currency("Euro",12,13,15,11));
        currencies.add(new Currency("Hryvnia",14,14,15,12));
    }

    /**
     * @return list of banks
     */

    public List<Bank> getBanks() {
        return banks;
    }

    public List<Currency> getCurrencies() {
        return currencies;
    }
}

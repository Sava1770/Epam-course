package model;

import entity.Bank;

import java.util.ArrayList;
import java.util.List;

public class BankRepository {

    private List<Bank> banks = new ArrayList<>();

    public BankRepository(){
        banks.add(new Bank("Privat",12, true, 1, true));
        banks.add(new Bank("Monobank",11, true, 2, true));
        banks.add(new Bank("Oschad",15, false, 0, false));
        banks.add(new Bank("Raiffaisen",13, true, 1, false));
    }

    public List<Bank> getBanks() {
        return banks;
    }

}

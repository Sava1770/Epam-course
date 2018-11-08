package model.comparators;

import entity.Bank;

import java.util.Comparator;

public class SumComparator implements Comparator<Bank> {

    @Override
    public int compare(Bank b1,Bank b2) {
        if(b1.getSumForThisBank() > b2.getSumForThisBank()){
            return -1;
        }
        else{
            return 1;
        }
    }

}
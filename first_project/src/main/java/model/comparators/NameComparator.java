package model.comparators;

import entity.Bank;

import java.util.Comparator;

public class NameComparator implements Comparator<Bank> {

    @Override
    public int compare(Bank b1, Bank b2) {
        return b1.getName().compareToIgnoreCase(b2.getName());
    }

}


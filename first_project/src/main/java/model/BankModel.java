package model;

import entity.Bank;

import java.util.Comparator;
import java.util.List;

/**
 * @author Savostin Roman
 * @see BankRepository
 */

public class BankModel {

    private BankRepository repository;

    /**
     * @param repository get repository for using
     */
    public BankModel(BankRepository repository) {
        this.repository = repository;
    }

    /**
     * method calculate money sum
     *
     * @param time - how long user want to take money in the bank
     * @param sum  - how much money he wants to take
     * @param i    - index of bank
     * @return result sum which user will get
     */
    public double sumCalculate(int time, int sum, int i) {  //calculate sum

        double percent = repository.getBanks().get(i).getPercentPerYear();    //get percent from bank with index i in list
        double resultSum = sum;
        int timeCurrent = 0;

        while (timeCurrent < time) {

            if (timeCurrent >= 5) {                                          // increase percent every year after 5 year
                percent = increaseAfterTerm(percent, i);
            }

            resultSum = resultSum + resultSum * (percent / 100);                    // increase sum
            timeCurrent++;
        }

        repository.getBanks().get(i).setSumForThisBank(resultSum);                 // set sum into Bank field

        return resultSum;
    }

    /**
     * method which set percents after currency choice
     *
     * @param currency - user choice of one of currencies
     */
    public void choiceCurrency(int currency) {
        List<Bank> banks = repository.getBanks();                                    //set percent after currency choice
        switch (currency) {
            case 1:
                banks.get(0).setPercentPerYear(12);
                banks.get(1).setPercentPerYear(11);
                banks.get(2).setPercentPerYear(15);
                banks.get(3).setPercentPerYear(13);
                break;
            case 2:
                banks.get(0).setPercentPerYear(13);
                banks.get(1).setPercentPerYear(12);
                banks.get(2).setPercentPerYear(15);
                banks.get(3).setPercentPerYear(14);
                break;
            case 3:
                banks.get(0).setPercentPerYear(14);
                banks.get(1).setPercentPerYear(12);
                banks.get(2).setPercentPerYear(15);
                banks.get(3).setPercentPerYear(14);
                break;
            default:
                break;
        }
    }

    /**
     * private method
     * every bank has extra percents which add, every year after fifth
     * this method return percents after add extra percents
     *
     * @param percent - percents before add percents
     * @param i       - index of bank
     * @return percents after add extra percents
     */

    private double increaseAfterTerm(double percent, int i) {   //add percent after every extra year
        return percent + repository.getBanks().get(i).getPercentYearIncrease();
    }

    /**
     * @return a list of Banks
     */
    public List<Bank> getBanks() {
        return repository.getBanks();
    }

    /**
     * sorting
     */
    public void banksSort(Comparator<Bank> b) {
        repository.getBanks().sort(b);
    }
}
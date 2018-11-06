package model;

import entity.Bank;

import java.util.List;

public class BankModel {

    private BankRepository repository;

    public BankModel(BankRepository repository){
        this.repository = repository;
    }

    public double sumCalculate(int time, int sum, int i){  //calculate sum

        double percent = repository.getBanks().get(i).getPercentPerYear();    //get percent from bank with index i in list
        double resultSum = sum;
        int timeCurrent = 0;

        while (timeCurrent < time) {

            if(timeCurrent >= 5){                                          // increase percent every year after 5 year
                percent = increaseAfterTerm(percent,i);
            }

            resultSum = resultSum + resultSum * (percent/100);                    // increase sum
            timeCurrent++;
        }

        return resultSum;
    }

    public boolean appExistance(int i){                          //check application existence
        return repository.getBanks().get(i).isApplication();
    }
    public boolean opportunityToGet(int i){                      // check opportunity to get money in every moment
        return repository.getBanks().get(i).isOpportunityToGet();
    }
    public boolean opportunityToSet(int i){                      //check opportunity to add money in every moment
        return repository.getBanks().get(i).isOpportunityToSet();
    }


    public void choiceCurrency(int currency){

    }

    private double increaseAfterTerm(double percent, int i){   //add percent after every extra year
        return percent + repository.getBanks().get(i).getPercentYearIncrease();
    }

    public List<Bank> getBanks(){
        return repository.getBanks();
    }
}

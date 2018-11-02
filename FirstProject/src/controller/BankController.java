package controller;

import model.BankModel;
import view.BankView;
import view.InputUtility;

import static view.Constants.*;

public class BankController {

    private BankView view;
    private BankModel model;

    public BankController(BankView view, BankModel model){
        this.view = view;
        this.model = model;
    }


    public void run() {
        int inputSum;
        int inputTime;
        double resultSum;

        inputSum = InputUtility.inputValue(view,SUM_INPUT);                     //input sum
        inputTime = InputUtility.inputValue(view,TIME_INPUT);                   //input time

        for(int i = 0; i < model.getBanks().size(); i++){
            resultSum = model.sumCalculate(inputTime, inputSum, i);             //calculate result sum
            view.print(resultSum, model.getBanks().get(i).getName(), model.getBanks().get(i).isOpportunityToGet(), model.getBanks().get(i).isApplication());
        }
    }


    private int currencyChoice(){
       int choice;
       int num = 1;

            while(num > 0){                                                                     //for choice currency

                switch (choice = InputUtility.inputValue(view, OUTPUT_SELECT_CURRENCY)){
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    default:
                        break;
                }

            }
        return choice;
    }
}

package controller;

import entity.Bank;
import model.BankModel;
import view.BankView;
import view.InputUtility;

import java.util.List;

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
        List<Bank> banks = model.getBanks();

        view.printMessage(FIRST_OUTPUT);                                        //show a different percents

        inputSum = InputUtility.inputValue(view,SUM_INPUT);                     //input sum
        inputTime = InputUtility.inputValue(view,TIME_INPUT);                   //input time

        for(int i = 0; i < banks.size(); i++){
            resultSum = model.sumCalculate(inputTime, inputSum, i);             //calculate result sum
            view.print(resultSum, banks.get(i).getName(), banks.get(i).isOpportunityToGet(), banks.get(i).isApplication());
        }
    }


    private int currencyChoice(){
       int choice = 0;

            while(choice < 1 || choice > 3){                                                                     //for choice currency

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

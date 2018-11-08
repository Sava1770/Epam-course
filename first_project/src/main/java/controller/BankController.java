package controller;

import entity.Bank;
import model.BankModel;
import model.comparators.*;
import view.BankView;
import view.InputUtility;
import java.util.List;

import static view.Constants.*;


/**
 * @author Savostin Roman
 * @see BankView
 * @see BankModel
 */
public class BankController {

    private BankView view;
    private BankModel model;
    private static final NameComparator NAME_COMPARATOR = new NameComparator();
    private static final SumComparator SUM_COMPARATOR = new SumComparator();

    /**
     * Constructor which creates object
     */
    public BankController(BankView view, BankModel model){
        this.view = view;
        this.model = model;
    }

    /**
     * method, which start program
     * it uses another method currencyChoice(), for set currency
     *
     * user choose currency, input sum he wants to put in the bank,
     * input time, and get results
     */

    public void run() {
        int inputSum;
        int inputTime;
        int inputSort;
        double resultSum;
        List<Bank> banks = model.getBanks();

        view.printMessage(FIRST_OUTPUT);                                        //show different percents
        model.choiceCurrency(currencyChoice());                                 //choose currency

        inputSum = InputUtility.inputValue(view,SUM_INPUT);                     //input sum
        inputTime = InputUtility.inputValue(view,TIME_INPUT);                   //input time

        for(int i = 0; i < banks.size(); i++){
            resultSum = model.sumCalculate(inputTime, inputSum, i);             //calculate result sum
            view.print(resultSum, banks.get(i).getName(), banks.get(i).isOpportunityToGet(), banks.get(i).isApplication());
        }

        switch (InputUtility.inputValue(view,SORT_INPUT)){
            case 1:
                model.banksSort(SUM_COMPARATOR);
                break;
            case 2:
                model.banksSort(NAME_COMPARATOR);
                break;
            default:
                break;
        }

        for(int i = 0; i < banks.size(); i++){
            resultSum = model.sumCalculate(inputTime, inputSum, i);             //calculate result sum
            view.print(resultSum, banks.get(i).getName(), banks.get(i).isOpportunityToGet(), banks.get(i).isApplication());
        }

    }

    /**
     * method, in which user choice a currency, as an integer number 1-3
     * @return int result
     */

    private int currencyChoice(){
       int choice = 0;

            while(choice < 1 || choice > 3){                                                                     //for choice currency
               choice = InputUtility.inputValue(view, OUTPUT_SELECT_CURRENCY);
            }
        return choice;
    }
}

package view;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import static view.Constants.WRONG_INPUT;

public  class InputUtility {

    private  Scanner scan = new Scanner(System.in);

    public  String inputString(VocabularyView view, String message){
        view.printMessage(message);

        while(true){
           try{
            return scan.next("[a-zA-Zа-яА-Я]{2,10}");
           }
           catch(InputMismatchException e){
             view.printMessage(WRONG_INPUT);
           }
           finally {
               scan.nextLine();
           }
        }

    }

}

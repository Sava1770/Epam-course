package view;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static view.Constants.WRONG_INPUT;

public class InputUtility {

    private static Scanner scan = new Scanner(System.in);


    public static String inputStringValue(JournalView view,String selectAction, String regEx){
       view.printMessage(selectAction);
       Pattern p = Pattern.compile(regEx);


        while(true){
            try {
                return scan.next(regEx);
            }
            catch (InputMismatchException e){
                view.printMessage(WRONG_INPUT);
                continue;
            }
            finally {
                scan.nextLine();
            }
        }

    }

}

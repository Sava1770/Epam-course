package view;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class InputUtility {

    private static Scanner scan = new Scanner(System.in);


    public static String inputStringValue(JournalView view,String selectAction, String regEx){
        view.printMessage(selectAction);
        Pattern p = Pattern.compile(regEx);

        return scan.next(p);

    }
}

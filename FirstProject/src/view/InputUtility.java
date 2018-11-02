package view;

import view.BankView;

import java.util.Scanner;

import static view.Constants.WRONG_INPUT_NUMBER;

public class InputUtility {

    private static final Scanner scan = new Scanner(System.in);
    private static final Scanner sc = new Scanner(System.in);


    public static int inputValue(BankView view, String selectAction) {
        view.printMessage(selectAction);

        while (!scan.hasNextInt()) {
            view.printMessage(WRONG_INPUT_NUMBER + selectAction);

            scan.next();
        }

        return scan.nextInt();
    }

    public static String inputLine(BankView view, String selectAction) {
        view.printMessage(selectAction);

        return sc.nextLine();
    }
}

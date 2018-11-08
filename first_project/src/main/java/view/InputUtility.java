package view;

import java.util.Scanner;

import static view.Constants.WRONG_INPUT_NUMBER;

/**
 * @author Savostin Roman
 */

public class InputUtility {

    private static final Scanner scan = new Scanner(System.in);

    /**
     *  method for getting an Integer number from user
     * @param view link to BankView object
     * @param selectAction - String message
     * @return int result
     */
    public static int inputValue(BankView view, String selectAction) {
        view.printMessage(selectAction);

        while (!scan.hasNextInt()) {
            view.printMessage(WRONG_INPUT_NUMBER + selectAction);

            scan.next();
        }

        return scan.nextInt();
    }
}

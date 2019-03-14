package book.view;

import java.util.Scanner;

import static book.view.Constants.WRONG_INPUT_NUMBER;

/**
 * @author Savostin Roman
 */
public class BookInput {

    private static final Scanner scan = new Scanner(System.in);
    private static Scanner sc = new Scanner(System.in);

    /**
     * method for get an Integer value
     * @param view - parameter for working with the class BookView
     * @param selectAction - string message
     * @return
     */
    public static int inputValue(BookView view, String selectAction) {
        view.printMessage(selectAction);

        while (!scan.hasNextInt()) {
            view.printMessage(WRONG_INPUT_NUMBER + selectAction);

            scan.next();
        }

        return scan.nextInt();
    }

    /**
     * method for get an String value
     */

    public static String inputStringValue(BookView view,String selectAction){
        view.printMessage(selectAction);

        return sc.nextLine();
    }
}

package task2.view;

import java.util.Scanner;

public class Input {

    private static final Scanner scan = new Scanner(System.in);
    private static final Scanner sc = new Scanner(System.in);


    public static int inputValue(ShopView view, String selectAction) {
        view.printMessage(selectAction);

        while (!scan.hasNextInt()) {
            view.printMessage(Constants.WRONG_INPUT_NUMBER + selectAction);

            scan.next();
        }

        return scan.nextInt();
    }

    public static String inputLine(ShopView view, String selectAction) {
        view.printMessage(selectAction);

        return sc.nextLine();
    }
}

package task3.task2.view;

import java.util.Scanner;
import static task2.draw.view.ShapeView.*;

public class Input {

    private static final Scanner scan = new Scanner(System.in);
    private static final Scanner sc = new Scanner(System.in);


    public static int inputValue(ShopView view, String selectAction) {
        view.printMessage(selectAction);

        while (!scan.hasNextInt()) {
            view.printMessage(WRONG_INPUT_NUMBER + selectAction);

            scan.next();
        }

        return scan.nextInt();
    }

    public static String inputLine(ShopView view, String selectAction) {
        view.printMessage(selectAction);

        return sc.nextLine();
    }
}

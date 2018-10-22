package task3.task1.view;

import java.util.Scanner;
import static task2.draw.view.ShapeView.*;

public class Input {

    private static Scanner scan = new Scanner(System.in);
    private static Scanner sc = new Scanner(System.in);


    public static int inputValue(ToysView view, String selectAction) {
        view.printMessage(selectAction);

        while (!scan.hasNextInt()) {
            view.printMessage(WRONG_INPUT_NUMBER + selectAction);

            scan.next();
        }

        return scan.nextInt();
    }

    public static String inputLine(ToysView view, String selectAction) {
        view.printMessage(selectAction);

        return sc.nextLine();
    }
}

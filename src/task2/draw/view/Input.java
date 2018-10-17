package task2.draw.view;

import java.util.Scanner;
import static task2.draw.view.ShapeView.*;

public class Input {


        private static Scanner scan = new Scanner(System.in);

        public static int inputValue(ShapeView view, String selectAction) {
            view.printMessage(selectAction);

            while (!scan.hasNextInt()) {
                view.printMessage(WRONG_INPUT_NUMBER + selectAction);

                scan.next();
            }

            return scan.nextInt();
        }
}

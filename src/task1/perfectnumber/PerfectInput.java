package task1.perfectnumber;

import java.util.Scanner;

public class PerfectInput {

    private static Scanner scan = new Scanner(System.in);

    public static int inputValue(PerfectView view){
        view.printMessage(view.INPUT_NUMBER);

        while (!scan.hasNextInt()){
            view.printMessage(view.WRONG_INPUT_NUMBER);

            scan.next();
        }

        return scan.nextInt();
    }
}

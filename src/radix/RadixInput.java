package radix;

import java.util.Scanner;

import static radix.RadixView.WRONG_INPUT_NUMBER;

public class RadixInput {

    private static Scanner scan = new Scanner(System.in);

    public static int inputValue(RadixView view, String numberOrSystem){
        view.printMessage(numberOrSystem);

        while (!scan.hasNextInt()){
            view.printMessage(WRONG_INPUT_NUMBER + numberOrSystem);

            scan.next();
        }

        return scan.nextInt();
    }

}

package matrix;

import java.util.Scanner;

import static matrix.MatrixView.WRONG_INPUT_NUMBER;

public class MatrixInput {

    private static Scanner scan = new Scanner(System.in);

    public static int inputValue(MatrixView view, String str ){
        view.printMessage(str);

        while (!scan.hasNextInt()){
            view.printMessage(WRONG_INPUT_NUMBER + str);

            scan.next();
        }

        return scan.nextInt();
    }

}
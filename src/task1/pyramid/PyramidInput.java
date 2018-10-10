package task1.pyramid;


import java.util.Scanner;

public class PyramidInput {

    private static Scanner scan = new Scanner(System.in);

    public static int inputValue(PyramidView view) {
        view.printMessage(view.INPUT_NUMBER);

        while (!scan.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT_NUMBER);

            scan.next();
        }

        return scan.nextInt();
    }

}

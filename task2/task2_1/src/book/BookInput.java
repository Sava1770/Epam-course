package book;

import java.util.Scanner;

import static book.BookView.*;

public class BookInput {

    private static final Scanner scan = new Scanner(System.in);
    private static Scanner sc = new Scanner(System.in);

    public static int inputValue(BookView view, String selectAction) {
        view.printMessage(selectAction);

        while (!scan.hasNextInt()) {
            view.printMessage(WRONG_INPUT_NUMBER + selectAction);

            scan.next();
        }

        return scan.nextInt();
    }

    public static String inputStringValue(BookView view,String selectAction){
        view.printMessage(selectAction);

//        while(!scan.hasNextLine()){
//            view.printMessage(WRONG_INPUT_NUMBER + selectAction);
//
//            scan.next();
//        }

        return sc.nextLine();
    }
}

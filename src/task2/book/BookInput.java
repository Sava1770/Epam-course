package task2.book;

import java.util.Scanner;

import static task2.book.BookView.*;

public class BookInput {

    private static Scanner scan = new Scanner(System.in);
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

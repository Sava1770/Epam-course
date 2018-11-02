package Task4_1.task2.book;

public class BookView {
    public static final String INPUT_NUMBER = "Input an integer number = ";
    public static final String WRONG_INPUT_NUMBER = "Wrong input!Please repeat.";
    public static final String OUTPUT_SELECT = "PRESS: 1 - Take list of books by author;\n" +
                                                      "2 - Take a list of books by publishing\n"+
                                                      "3 - Take a list of books after some year\n"+
                                                      "4 - Sort books by publishing";
    public static final String RIGHT_RESULT = "Your result";
    public static final String INPUT_AUTHOR = "Input author name";
    public static final String INPUT_PUBLISHING = "Input a name of publishing house";
    public static final String INPUT_YEAR = "Input year";



    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageAndResult(String message,String result){
        System.out.println(message + result);
    }
}

package radix;

public class RadixView {

    public static final String INPUT_NUMBER = "Input an integer number = ";
    public static final String WRONG_INPUT_NUMBER = "Wrong input!Please repeat.";
    public static final String INPUT_RADIX = "Input a radix system = ";
    public static final String RIGHT_RESULT = "Your result";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageAndResult(String message,String result,int radixSystem){
        System.out.println(message + " in " + radixSystem + " system = " + result);
    }

}

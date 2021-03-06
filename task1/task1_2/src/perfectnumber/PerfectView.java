package perfectnumber;

public class PerfectView {

    public static final String INPUT_NUMBER = "Input an integer number = ";
    public static final String WRONG_INPUT_NUMBER = "Wrong input!Please repeat.";
    public static final String RIGHT_RESULT = "Your result";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageAndResult(String message,int result){
        System.out.println(message + " " +result);
    }

    public void outputArray(PerfectModel model){
        int[] perfectNumbers = model.findPerfectNumbers();

        for(int i = 0; i < perfectNumbers.length; i++){
            if (perfectNumbers[i] > 0) {
                printMessageAndResult(RIGHT_RESULT, perfectNumbers[i]);
            }
        }
    }

}

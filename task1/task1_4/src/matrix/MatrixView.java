package matrix;

public class MatrixView {

    public static final String INPUT_NUMBER = "Input task1.matrix size less then 7 = ";
    public static final String WRONG_INPUT_NUMBER = "Wrong input!Please repeat.";
    public static final String RIGHT_RESULT = "Your result";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void matrixOutput(int size, int [][] array){

        for (int x = 0; x < size; x++){
            for (int y = 0; y < size; y++){
                System.out.print(array[x][y] + " ");
            }

            System.out.print("\n");
        }
        System.out.print("\n");
    }

}

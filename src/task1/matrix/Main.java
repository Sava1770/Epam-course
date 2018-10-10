package task1.matrix;

public class Main {

    public static void main(String[] args){
        MatrixView view = new MatrixView();
        MatrixModel model = new MatrixModel();
        MatrixController controller = new MatrixController(model,view);

        controller.turn();
    }
}

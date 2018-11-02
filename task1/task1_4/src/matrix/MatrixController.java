package matrix;

import static matrix.MatrixView.INPUT_NUMBER;

public class MatrixController {

    private MatrixModel model;
    private MatrixView view;

    public MatrixController() {
    }

    public MatrixController(MatrixModel model, MatrixView view) {
        this.model = model;
        this.view = view;
    }

    public void turn(){
        model.setSize(MatrixInput.inputValue(view, INPUT_NUMBER));
        model.matrixCreate();
        view.matrixOutput(model.getSize(),model.getArray());
        model.matrixTurn();
        view.matrixOutput(model.getSize(),model.getArray());

    }
}

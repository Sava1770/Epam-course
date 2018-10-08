package pyramid;

public class Main {

    public static void main(String[] args) {
        PyramidView view = new PyramidView();
        PyramidModel model = new PyramidModel();
        PyramidController controller = new PyramidController(model, view);

        controller.makePyramid();
    }

}

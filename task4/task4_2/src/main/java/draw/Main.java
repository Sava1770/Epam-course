package draw;

import draw.controller.ShapeController;
import draw.model.ShapeModel;
import draw.model.ShapeRepository;
import draw.view.ShapeView;

public class Main {

    public static void main(String[] args) {

        ShapeRepository repository = new ShapeRepository();
        ShapeModel model = new ShapeModel(repository);
        ShapeView view = new ShapeView(model);

        ShapeController controller = new ShapeController(model, view);
        controller.getInformation();
    }
}

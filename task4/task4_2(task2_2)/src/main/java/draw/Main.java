package draw;

import draw.controller.ShapeController;
import draw.model.ShapeModel;
import draw.model.ShapeRepository;
import draw.view.ShapeView;

/**
 * @author Savostin Roman
 */
public class Main {
    /**
     * start program
     * create all instances
     */
    public static void main(String[] args) {

        ShapeRepository repository = new ShapeRepository();
        ShapeModel model = new ShapeModel(repository);
        ShapeView view = new ShapeView(model);

        ShapeController controller = new ShapeController(model, view);
        controller.run();
    }
}

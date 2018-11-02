package Task4_1.task2.draw;

import Task4_1.task2.draw.controller.ShapeController;
import Task4_1.task2.draw.model.ShapeModel;
import Task4_1.task2.draw.model.ShapeRepository;
import Task4_1.task2.draw.view.ShapeView;

public class Main {

    public static void main(String[] args) {

        ShapeRepository repository = new ShapeRepository();
        ShapeModel model = new ShapeModel(repository);
        ShapeView view = new ShapeView(model);

        ShapeController controller = new ShapeController(model, view);
        controller.getInformation();
    }
}

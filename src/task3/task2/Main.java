package task3.task2;

import task2.draw.controller.ShapeController;
import task3.task2.controller.ShopController;
import task3.task2.model.ShopModel;
import task3.task2.model.ShopRepository;
import task3.task2.view.ShopView;

public class Main {

    public static void main(String [] args) {
        ShopRepository shopRepository = new ShopRepository();
        ShopModel model = new ShopModel(shopRepository);
        ShopView view = new ShopView();
        ShopController controller = new ShopController(view,model);

        controller.run();


    }

}

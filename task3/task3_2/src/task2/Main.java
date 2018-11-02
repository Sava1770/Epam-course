package task2;

import task2.controller.ShopController;
import task2.model.ShopModel;
import task2.model.ShopRepository;
import task2.view.ShopView;

public class Main {

    public static void main(String [] args) {
        ShopRepository shopRepository = new ShopRepository();
        ShopModel model = new ShopModel(shopRepository);
        ShopView view = new ShopView();
        ShopController controller = new ShopController(view,model);

        controller.run();


    }

}

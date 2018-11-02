package task1;

import task1.controller.ToysController;
import task1.entity.Toys;
import task1.model.ToysModel;
import task1.view.ToysView;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args){
        ToysModel model = new ToysModel();
        ToysView view = new ToysView(model);
        ArrayList<Toys> list = model.getList();
        ToysController controller = new ToysController(model,view,list);
        controller.run();
    }
}

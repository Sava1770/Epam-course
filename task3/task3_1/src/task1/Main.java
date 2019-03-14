package task1;

import task1.controller.ToysController;
import task1.entity.ChildRoom;
import task1.entity.Toys;
import task1.model.ToysModel;
import task1.view.ToysView;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args){
        ChildRoom<Toys> room = new ChildRoom<>();
        ToysModel model = new ToysModel(room);
        ToysView view = new ToysView(model);
        ArrayList<Toys> list = model.getList();
        ToysController controller = new ToysController(model,view,list);
        controller.run();

    }
}

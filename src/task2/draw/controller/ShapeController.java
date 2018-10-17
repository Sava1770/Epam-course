package task2.draw.controller;


import task2.draw.*;
import task2.draw.Shape;
import task2.draw.model.ShapeModel;
import task2.draw.view.*;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ShapeController {

    ShapeModel model = new ShapeModel();
    ShapeView view = new ShapeView(model);
    AreaCompare compArea = new AreaCompare();
    ColorCompare compColor = new ColorCompare();

    public void getInformation(){

        switch(Input.inputValue(view, view.OUTPUT_SELECT_FIRST))
        {
            case 1:
                view.printAllFigures();
                break;
            case 2:
                view.printSumOfAllFigures();
                break;
            case 3:
                switch(Input.inputValue(view, view.OUTPUT_SELECT_SECOND)){  // выбор, площади какой из фигур суммировать
                    case 1:
                        view.printSumOfOneFigures(new Triangle());
                        break;
                    case 2:
                        view.printSumOfOneFigures(new Circle());
                        break;
                    case 3:
                        view.printSumOfOneFigures(new Rectangle());
                        break;
                    default:
                        break;
                }

                break;
            case 4:
                Arrays.sort(model.getShapes(),compArea);
                view.printAllFigures();
                break;
            case 5:
                Arrays.sort(model.getShapes(),compColor);
                view.printAllFigures();
                break;
            default:
                break;
        }

    }
}

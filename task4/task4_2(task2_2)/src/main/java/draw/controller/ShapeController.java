package draw.controller;


import draw.model.ShapeModel;
import draw.model.ShapeRepository;
import draw.model.comparators.*;
import draw.entity.*;
import draw.view.*;
import static draw.view.ShapeView.*;

/**
 * @author Savostin Roman
 * @see ShapeModel
 * @see ShapeView
 */
public class ShapeController {

    private ShapeModel model;
    private ShapeView view;

    /**
     * The constructor that allows the programmer to create an object with parameters
     * @param model - parameter for working with the class ShapeModel.
     * @param view - parameter for working with the class ShapeView.
     */
    public ShapeController(ShapeModel model, ShapeView view){
        this.model = model;
        this.view = view;
    }

    /**
     * run our program
     */

    public void run(){

        int i = 1;

        while(i == 1){
            switch(Input.inputValue(view, OUTPUT_SELECT_FIRST))
            {
                case 1:
                    view.printAllFigures();
                    break;
                case 2:
                    view.printSumOfAllFigures();
                    break;
                case 3:
                    choiceFigure();
                    break;
                case 4:
                    model.sort(new AreaCompare());
                    view.printAllFigures();
                    break;
                case 5:
                    model.sort(new ColorCompare());
                    view.printAllFigures();
                    break;
                case 0:
                    i = 0;
                    break;
                default:
                    break;
            }
        }

    }

    private void choiceFigure(){
        switch(Input.inputValue(view, OUTPUT_SELECT_SECOND)){  // choice, areas of what figure we should calculate
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
    }
}

package draw.view;

import draw.Shape;
import draw.model.ShapeModel;

public class ShapeView {

    private ShapeModel model;
    private Shape[] shapes ;


    public ShapeView (ShapeModel model){
        this.model = model;
        this.shapes = model.getShapes();
    }

    public static final String WRONG_INPUT_NUMBER = "Wrong input!Please repeat.";
    public static final String OUTPUT_SELECT_FIRST = "PRESS: 1 - Take list of all figures;\n" +
            "2 - Calculate area sum of all figures;\n"+
            "3 - Calculate area sum of one of the figures;\n"+
            "4 - Sort figures by area;\n"+
            "5 - Sort figures by color;";
    public static final String RIGHT_RESULT = "Your result";
    public static final String OUTPUT_SELECT_SECOND = "PRESS: 1 - Calculate triangles area;\n"+
                                                              "2 - Calculate circles area;\n"+
                                                              "3 - Calculate rectangles area;\n";
    public void printAllFigures(){
        for(int i = 0; i < shapes.length; i++){
        shapes[i].draw();
        System.out.println("\n");
        }
    }

    public void printSumOfAllFigures(){
        System.out.println(model.sumCalcAllArea());
    }

    public void printSumOfOneFigures(Shape s){
        System.out.println(model.sumCalcArea(s));
    }

    public void printMessage(String message){
        System.out.println(message);
    }
}

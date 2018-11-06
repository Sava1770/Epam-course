package draw.model;

import draw.entity.Circle;
import draw.entity.Rectangle;
import draw.entity.Shape;
import draw.entity.Triangle;

import java.util.Arrays;
import java.util.Comparator;

public class ShapeModel {


    private ShapeRepository repository;

    public ShapeModel(ShapeRepository repository) {
        this.repository = repository;
    }

    public Shape[] getShapes() {
        return repository.getShapes();
    }

    public double sumCalcAllArea(){

        double sum = 0;

        for(int i = 0; i < repository.getShapes().length; i++){
            sum += repository.getShapes()[i].calcArea();
        }
        return sum;
    }

    public double sumCalcArea(Shape choice){

        double sum = 0;

        for(int i = 0; i < repository.getShapes().length; i++){

          if(repository.getShapes()[i] instanceof Triangle && choice instanceof Triangle)
            sum += repository.getShapes()[i].calcArea();
          else if(repository.getShapes()[i] instanceof Rectangle && choice instanceof Rectangle)
            sum += repository.getShapes()[i].calcArea();
          else if(repository.getShapes()[i] instanceof Circle && choice instanceof Circle)
            sum += repository.getShapes()[i].calcArea();

        }
        return sum;
    }

    public void sort(Comparator comp){
        Arrays.sort(repository.getShapes(),comp);
    }

}

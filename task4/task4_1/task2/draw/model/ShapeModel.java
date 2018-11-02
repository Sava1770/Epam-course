package Task4_1.task2.draw.model;

import Task4_1.task2.draw.entity.Circle;
import Task4_1.task2.draw.entity.Rectangle;
import Task4_1.task2.draw.entity.Shape;
import Task4_1.task2.draw.entity.Triangle;

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
          if(repository.getShapes()[i] instanceof Rectangle && choice instanceof Rectangle)
            sum += repository.getShapes()[i].calcArea();
          if(repository.getShapes()[i] instanceof Circle && choice instanceof Circle)
            sum += repository.getShapes()[i].calcArea();

        }
        return sum;
    }

    public void sort(Comparator comp){
        Arrays.sort(repository.getShapes(),comp);
    }

}

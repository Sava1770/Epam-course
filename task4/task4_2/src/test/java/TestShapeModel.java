import draw.entity.*;
import draw.model.ShapeModel;
import draw.model.ShapeRepository;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * @author Savostin Roman
 * test class for task2_2
 */

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class TestShapeModel {

    /**
     * for creating all shapes
     */
    public static ShapeModel model;
    public static ShapeRepository repository;

    /**
     * different parameters
     */
    @Parameterized.Parameter
    public double sumArea;
    @Parameterized.Parameter(1)
    public double sumAllArea;
    @Parameterized.Parameter(2)
    public Shape shape;

    /**
     * initialization repository
     */
    @BeforeClass
    public static void init() {
        repository = new ShapeRepository();
        model = new ShapeModel(repository);
    }

    /**
     * @return parameters for test
     */

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{
                {1027.43, 46777.45, new Triangle ()},
                {34185.82, 46777.45, new Rectangle()},
                {11564.20, 46777.45, new Circle()}
        });
    }

    /**
     * method for test sum area for all figures
     */
    @Test
    public void testSumCalcAllArea(){

        double result  = model.sumCalcAllArea();
        Assert.assertEquals(sumAllArea, result, 0.1);
    }

    /**
     * method for test sum area of one type of figures
     */
    @Test
    public void testSumCalcArea(){

        double result  = model.sumCalcArea(shape);
        Assert.assertEquals(sumArea, result, 0.1);
    }

}

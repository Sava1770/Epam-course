import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args){

        Runner runner = new Runner();

        try {
            runner.run();
        }catch(NoSuchMethodException | IllegalAccessException |
                InvocationTargetException | InstantiationException | NoSuchFieldException e) {

            e.printStackTrace();
        }
    }
}

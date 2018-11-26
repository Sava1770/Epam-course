import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Runner {

    public void run() throws NoSuchMethodException, IllegalAccessException,
            InvocationTargetException, InstantiationException, NoSuchFieldException{

        Class<?> clazz = UnArithmeticOperation.class;
        Class<?>[] parameters = new Class<?>[]{double.class};

        Constructor<?> con = clazz.getConstructor(parameters);
        UnArithmeticOperation operation = (UnArithmeticOperation)con.newInstance(12.2d);

        Field field = clazz.getDeclaredField("variable");
        field.setAccessible(true);
        System.out.println(field.get(operation));

        Method method = clazz.getMethod("setH", double.class);

        method.invoke(operation,15.2d);

        System.out.println(operation);
    }
}

import java.lang.reflect.Field;

public class ReflectionUse {


    public void run() throws NoSuchFieldException,IllegalAccessException{
        String str = "string before change";
        String string = "string after change";

        Class<?> clazz = str.getClass();
        Field field = clazz.getDeclaredField("value");

        field.setAccessible(true);
        field.set(str,string.toCharArray());

        System.out.println(str);
    }

}

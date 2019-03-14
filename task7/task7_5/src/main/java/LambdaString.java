@FunctionalInterface
public interface LambdaString {

    String stringConvertation(String x);

    default boolean isExist(String s){
        if(s == null || s.equals(""))
            return false;
        else
            return true;

    }
}

@FunctionalInterface
public interface LambdaString {

    public String stringConvertation(String x);

    default boolean isExist(String s){
        if(s == null){
            return false;
        }else{
            return true;
        }
    }
}

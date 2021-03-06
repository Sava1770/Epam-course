import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaWork {

    public void run(){
        //create int random array
        Integer [] array = new Integer[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 10);
            System.out.print(array[i]+ " ");
        }

        System.out.println();
        //changes
        array = arrayBiMultiply(array, x -> x*2);
        //show after changes
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println();

        //create list of strings
        List<String> strings = new ArrayList<>();
        strings.add("dbca");
        strings.add("adbc");
        strings.add("afghjkl");
        strings.add("cdba");
        strings.add("abvdhdtkjgh");
        strings.add("bcda");

        System.out.println("before filtration:");
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }

        strings = stringFiltration(strings, x -> x.startsWith("a"));

        System.out.println("after filtration:");
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }

        strings = stringToUpper(strings, String::toUpperCase );

        System.out.println("after upper case:");
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }

    private Integer[] arrayBiMultiply(Integer[] array, Lambda lambda){

        for(int i = 0; i < array.length; i++){
            array[i] = lambda.calc(array[i]);
        }
        return array;
    }

    private List<String> stringFiltration(List<String> strings, Predicate<String> lambda){
        List<String> list = new ArrayList<>();

        for(int i = 0; i < strings.size(); i++){
            if(lambda.test(strings.get(i))){
                list.add(strings.get(i));
            }
        }
        return list;
    }

    private List<String> stringToUpper(List<String> strings, LambdaString lambda){

        for(int i = 0; i < strings.size(); i++){
            if(lambda.isExist(strings.get(i)))
                strings.set(i, lambda.stringConvertation(strings.get(i)));
        }

        return strings;
    }
}

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaWork {

    public void run(){
        Integer [] array = new Integer[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 10);
            System.out.print(array[i]+ " ");
        }

        System.out.println();

        Arrays.sort(array, (a,b) -> b - a);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println();


        List<String> strings = new ArrayList<>();
        strings.add("dbca");
        strings.add("adbc");
        strings.add("cdba");
        strings.add("bcda");
        System.out.println("before sort:");
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }

        Collections.sort(strings, (s1,s2) -> {
            if (s1.compareTo(s2) > 0) return -1;
            else if (s1.compareTo(s2) < 0) return 1;
            else return 0;});

        System.out.println("after sort:");
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }

    }
}

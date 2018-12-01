import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {

    public void run(){

        List<Integer> numbers = Stream.iterate(10, n -> n+10)
                .limit(10)
                .map(n -> n/2)
                .collect(Collectors.toList());

        for(int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }

        List <Person> personList = listCreate();

        personList.stream()
                .filter(person -> person.getAge() >= 20 && person.getGender().equals("male"))
                .forEach(person ->  System.out.println(person));

        Double averageAge = personList.stream()
                .filter(person -> person.getGender().equals("female"))
                .mapToDouble(Person::getAge)
                .average()
                .getAsDouble();

        System.out.println("Average age = " + averageAge);
    }

    private List<Person> listCreate (){

         List<Person> personList = new ArrayList<>();

         personList.add(new Person("Roma", 20, "male"));
         personList.add(new Person("Masha", 19, "female"));
         personList.add(new Person("Vitaliy", 21, "male"));
         personList.add(new Person("Arina", 18, "female"));
         personList.add(new Person("Misha", 10, "male"));
         personList.add(new Person("Alex", 18, "male"));
         personList.add(new Person("Kate", 8, "female"));
         personList.add(new Person("Oleg", 40, "male"));
         personList.add(new Person("Valera", 48, "male"));

         return personList;

    }
}

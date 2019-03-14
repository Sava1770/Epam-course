public class Person {

    private String name;
    private int age;
    private String gender;

    public Person(){
        this("Andrew",18,"male");
    }

    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString(){
        System.out.println( "name: " + name + " age: " + age + " sex: " + gender);
        return "name: " + name + " age: " + age + " sex: " + gender;
    }
}

package task3.task1.entity;

public class SportToys extends Toys {

    private String sportType;

    public SportToys(String color, int cost, int weight, String sportType){
        setId((int)(Math.random()*100));
        setColor(color);
        setCost(cost);
        setWeight(weight);
        this.sportType = sportType;
    }

    @Override
    public String toString(){
        String str = super.toString();
        return this.getClass().getSimpleName() + str;
    }
}

package task1.entity;


import java.util.ArrayList;

public class ChildRoom <T extends Toys> {

    private ArrayList<Toys> list = new ArrayList<>();

    public ChildRoom(){
        list.add(new RobotToys("red",100,30,100));
        list.add(new SportToys("blue",80,80,"Box"));
        list.add(new ConstructorToys("red",100,100,"Easy"));
        list.add(new RobotToys("white",100,20,60));
        list.add(new SportToys("green",80,20,"Football"));
        list.add(new ConstructorToys("green",100,110,"Medium"));
        list.add(new RobotToys("green",100,410,70));
        list.add(new SportToys("black",80,20,"Football"));
        list.add(new ConstructorToys("white",100,440,"Hard"));
    }

    public ArrayList<Toys> getList() {
        return list;
    }

}

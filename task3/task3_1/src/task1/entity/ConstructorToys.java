package task1.entity;

import task1.entity.Toys;

public class ConstructorToys extends Toys {

    private String complexity;

    public ConstructorToys(String color, int cost, int weight, String complexity){
        setId((int)(Math.random()*100));
        setColor(color);
        setCost(cost);
        setWeight(weight);
        this.complexity = complexity;
    }

    @Override
    public String toString(){
        String str = super.toString();
        return this.getClass().getSimpleName() + str;
    }

}

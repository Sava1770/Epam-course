package task1.entity;

import task1.entity.Toys;

public class RobotToys extends Toys {

    private int maxSpeed;

    public RobotToys(String color, int cost, int weight, int maxSpeed){
        setId((int)(Math.random()*100));
        setColor(color);
        setCost(cost);
        setWeight(weight);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString(){
        String str = super.toString();
        return this.getClass().getSimpleName() + str;
    }
}

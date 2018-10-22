package task3.task1.entity;

public abstract class Toys {

    private int id;
    private String color;
    private int cost;
    private int weight;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString(){
        return (", id: " + id + ", color: " + color + ", cost: " + cost + ", weight " + weight);
    }

}

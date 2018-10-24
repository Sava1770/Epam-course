package task3.task2.model.comparators;

import task3.task2.entity.Shop;

import java.util.Comparator;

public class IdComparator implements Comparator<Shop.Department> {
    @Override
    public int compare(Shop.Department s1, Shop.Department s2){
        return Integer.compare(s1.getId(),s2.getId());
    }
}

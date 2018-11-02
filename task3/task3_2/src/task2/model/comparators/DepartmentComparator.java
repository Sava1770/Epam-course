package task2.model.comparators;

import task2.entity.Shop;

import java.util.Comparator;

public class DepartmentComparator implements Comparator<Shop.Department> {

    @Override
    public int compare(Shop.Department t1, Shop.Department t2) {
        return t1.getDepartmentName().compareToIgnoreCase(t2.getDepartmentName());
    }

}
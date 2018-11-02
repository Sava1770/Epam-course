package task1.model.comparators;

import task1.entity.Toys;

import java.util.Comparator;

public class IdComparator implements Comparator<Toys> {
    @Override
    public int compare(Toys s1, Toys s2) {
        return Integer.compare(s1.getId(),s2.getId());
    }
}

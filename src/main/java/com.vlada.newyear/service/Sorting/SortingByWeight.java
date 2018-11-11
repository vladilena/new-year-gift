package com.vlada.newyear.service.Sorting;

import com.vlada.newyear.domain.Entity.Sweets;

import java.util.Comparator;

public class SortingByWeight implements Comparator<Sweets> {

    public int compare(Sweets o1, Sweets o2) {
        double p1 = o1.getWeight();
        double p2 = o2.getWeight();
        if (p1 < p2) {
            return 1;
        } else if (p1 > p2) {
            return -1;
        } else
            return 0;
    }
}

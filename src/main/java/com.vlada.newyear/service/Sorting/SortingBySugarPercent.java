package com.vlada.newyear.service.Sorting;

import com.vlada.newyear.domain.Entity.Sweets;

import java.util.Comparator;

public class SortingBySugarPercent implements Comparator<Sweets> {

    public int compare(Sweets o1, Sweets o2) {
        double p1 = o1.getSugar();
        double p2 = o2.getSugar();
        if (p1 < p2) {
            return 1;
        } else if (p1 > p2) {
            return -1;
        } else
            return 0;
    }
}

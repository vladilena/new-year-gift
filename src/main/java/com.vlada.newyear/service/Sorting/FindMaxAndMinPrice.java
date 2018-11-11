package com.vlada.newyear.service.Sorting;

import com.vlada.newyear.domain.Entity.Sweets;

import java.util.ArrayList;

public class FindMaxAndMinPrice {
    public static double findMaxPriceInList(ArrayList<Sweets> list) {

        double max = list.get(0).getPrice();
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).getPrice() > max) {
                max = list.get(i).getPrice();
            }
        }
        return max;
    }

    public static double findMinPriceInList(ArrayList<Sweets> list) {

        double min = list.get(0).getPrice();
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).getPrice() < min) {
                min = list.get(i).getPrice();
            }
        }
        return min;
    }

}

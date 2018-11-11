package com.vlada.newyear.service.Sorting;

import com.vlada.newyear.service.GiftService.Color;
import com.vlada.newyear.domain.Entity.Sweets;
import com.vlada.newyear.service.impl.GiftServiceImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class ChooseSorting {
    public static void chooseSortingMethodFromKeyInput(ArrayList<Sweets> list, GiftServiceImpl gift, Scanner sc) {
        System.out.println(Color.GREEN.getColor() + "You can sort your sweets. \nChoose sorting method: \nBy price - 1; \nBy sugar percent - 2; \nBy weight -3." + Color.RESET.getColor());
        String choose = sc.next();
        switch (choose) {
            case "1": {
                System.out.println(Color.PURPLE.getColor() + "\nSorted gift items by price" + Color.RESET.getColor());
                list.sort(new SortingByPrice());
                gift.displayCollection(list);
                break;
            }
            case "2": {
                System.out.println(Color.BLUE.getColor() + "\nSorted gift items by sugar percent" + Color.RESET.getColor());
                list.sort(new SortingBySugarPercent());
                gift.displayCollection(list);
                break;
            }

            case "3": {
                System.out.println(Color.CYAN.getColor() + "\nSorted gift items by weight" + Color.RESET.getColor());
                list.sort(new SortingByWeight());
                gift.displayCollection(list);
                break;
            }
        }
    }
}



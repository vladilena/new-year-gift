package com.vlada.newyear.service.Sorting;

import com.vlada.newyear.service.GiftService.Color;
import com.vlada.newyear.domain.Entity.Sweets;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class FindElementByPrice {
    public static void findElementByPrice(ArrayList<Sweets> list, Scanner sc) {
        /*  find element with price between a and b.*/
        System.out.println(Color.RED.getColor() + "You can find sweet by price. Enter first and last range numbers" + Color.RESET.getColor());
        System.out.println("a = ");
        double a = sc.nextDouble();
        System.out.println("b = ");
        double b = sc.nextDouble();

        while (!checkInputRange(a, b) || !checkMaxAndMinRange(a, b, list)) {
            System.out.println("a = ");
            a = sc.nextDouble();
            System.out.println("b = ");
            b = sc.nextDouble();
        }
        StringBuilder item = findSweetByPrice(a, b, list);
        System.out.println("Your sweets are: ");
        System.out.println(item);

    }

    private static StringBuilder findSweetByPrice(double a, double b, ArrayList<Sweets> list) {


        StringBuilder sweet = new StringBuilder();
        int n = 0;
        for (Sweets sweets : list) {
            if (isInRange(a, b, list, n)) {
                sweet.append(" " + sweets.getName()).append(" (").append(sweets.getPrice()).append(")").append(";");
            }
            n++;
        }
        return sweet;
    }

    private static boolean checkInputRange(double a, double b) {
        boolean status = true;
        if (a < 0 || b < 0) {
            System.out.println("Price cannot be negative. Try again");
            status = false;
        }
        return status;
    }

    private static boolean checkMaxAndMinRange(double a, double b, ArrayList<Sweets> list) {
        boolean status = true;
        if (((a < FindMaxAndMinPrice.findMinPriceInList(list) && b < FindMaxAndMinPrice.findMinPriceInList(list))
                || (a > FindMaxAndMinPrice.findMaxPriceInList(list) && b > FindMaxAndMinPrice.findMaxPriceInList(list)))) {
            System.out.println("Sorry, we don`t have sweets in this range.Try again");
            status = false;
        }
        return status;
    }

    private static boolean isInRange(double a, double b, ArrayList<Sweets> list, int n) {
        boolean status = false;

        if ((list.get(n).getPrice() >= a && list.get(n).getPrice() <= b) || (list.get(n).getPrice() <= a && list.get(n).getPrice() >= b)) {
            status = true;

        }
        return status;
    }

}

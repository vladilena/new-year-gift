package com.vlada.newyear;
import com.vlada.newyear.domain.Entity.Sweets;
import com.vlada.newyear.service.Sorting.ChooseSorting;
import com.vlada.newyear.service.Sorting.FindElementByPrice;
import com.vlada.newyear.service.impl.GiftServiceImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Main implements Comparable{
    public static void main(String[] args) throws IOException {
        String s = "______________________________________________";
        GiftServiceImpl gift = new GiftServiceImpl();
        ArrayList<Sweets> list = gift.createMyGiftCollection();

        GiftServiceImpl.createNewYearGift(gift,list);
        System.out.println(s);
        Scanner sc = new Scanner(System.in);
        FindElementByPrice.findElementByPrice(list,sc);
        System.out.println(s);
        ChooseSorting.chooseSortingMethodFromKeyInput(list,gift,sc);
        sc.close();
        System.out.println(s);

    }
}

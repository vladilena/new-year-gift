package com.vlada.newyear.service.impl;

import com.vlada.newyear.service.GiftService.Color;
import com.vlada.newyear.service.GiftService.GiftService;
import com.vlada.newyear.domain.Entity.Sweets;

import com.vlada.newyear.domain.Entity.BountyBar;
import com.vlada.newyear.domain.Entity.Cookie;
import com.vlada.newyear.domain.Entity.JellyCandy;
import com.vlada.newyear.domain.Entity.Lollipop;
import com.vlada.newyear.domain.Entity.SantaClausCandy;

import java.io.*;
import java.util.ArrayList;

public class GiftServiceImpl implements GiftService {


    public static void createNewYearGift(GiftServiceImpl gift, ArrayList <Sweets> list) throws IOException {
        System.out.println(Color.GREEN.getColor() + "It's your new year gift!!" + Color.RESET.getColor());
        gift.displayCollection(list);
        gift.save(list);

        double totalPrice = gift.getFinalPrice(list, 0);
        System.out.println(Color.GREEN.getColor() + "Price of this gift is " + totalPrice + " USD." + Color.RESET.getColor());
    }


    public ArrayList<Sweets> createMyGiftCollection() {
        ArrayList<Sweets> list = new ArrayList<>();

        list.add(new BountyBar("Bounty", 0.05, 15, true, 2.00, "White"));
        list.add(new BountyBar("Bounty", 0.05, 12, true, 2.10, "Milk"));
        list.add(new Cookie("Chocolate Paradise", 0.400, 10, true, 5.99, true));
        list.add(new Cookie("Oreo", 0.250, 16, false, 3.99, true));
        list.add(new JellyCandy("JellyBeans", 0.152, 50, false, 0.99, "CocaCola"));
        list.add(new Lollipop("Sweet things", 0.015, 62, false, 0.15, "Strawberry"));
        list.add(new Lollipop("Sweet things", 0.015, 62, false, 0.15, "Coffee"));
        list.add(new SantaClausCandy("Happy Santa", 0.120, 17, true, 1.50, "Red"));
        return list;
    }

    @Override
    public double getFinalPrice(ArrayList<Sweets> list, double sum) {
        for (Sweets sweets : list) {
            sum += sweets.getPrice();
        }

        return sum;
    }


    @Override
    public void displayCollection(ArrayList<Sweets> list) {

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + ". " + list.get(i));
        }
    }


    @Override
    public void save(ArrayList<Sweets> list) throws IOException {
        File file = new File("gift.txt");
        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
        for (int i = 0; i < list.size(); i++) {
            bf.write(i + 1 + ". " + list.get(i) + "\n");
        }
        bf.flush();
        bf.close();
    }
}

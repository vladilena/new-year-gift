package com.vlada.newyear.service.GiftService;

import com.vlada.newyear.domain.Entity.Sweets;

import java.io.IOException;
import java.util.ArrayList;

public interface GiftService {
    double getFinalPrice(ArrayList<Sweets> list, double sum);

    void displayCollection(ArrayList<Sweets> list);

    void save(ArrayList<Sweets> list) throws IOException;
}

package com.vlada.newyear.domain.Entity;

public class JellyCandy extends Sweets {
    private String filling;

    public JellyCandy(String name, double weight, double sugar, boolean isChocolate, double price, String filling) {
        super(name, weight, sugar, isChocolate, price);
        this.filling = filling;
    }

    public JellyCandy() {
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", filling: " + filling + ".";
    }
}

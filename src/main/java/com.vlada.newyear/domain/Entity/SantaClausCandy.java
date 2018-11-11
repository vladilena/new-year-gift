package com.vlada.newyear.domain.Entity;

public class SantaClausCandy extends Sweets {
    private String color;

    public SantaClausCandy(String name, double weight, double sugar, boolean isChocolate, double price, String color) {
        super(name, weight, sugar, isChocolate, price);
        this.color = color;
    }

    public SantaClausCandy() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", color:" + color + ".";
    }
}

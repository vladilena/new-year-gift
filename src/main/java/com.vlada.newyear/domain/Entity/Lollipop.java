package com.vlada.newyear.domain.Entity;

public class Lollipop extends Sweets {
    private String flavour;

    public Lollipop(String name, double weight, double sugar, boolean isChocolate, double price, String flavour) {
        super(name, weight, sugar, isChocolate, price);
        this.flavour = flavour;
    }

    public Lollipop() {
    }

    public String getFlavour() {
        if (flavour.length() > 10) {
            throw new IllegalArgumentException("Flavour cannot contains more than 10 characters");
        }
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", flavour: " + flavour + ".";
    }
}

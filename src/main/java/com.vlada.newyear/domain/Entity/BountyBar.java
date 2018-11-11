package com.vlada.newyear.domain.Entity;

public class BountyBar extends Sweets {
    private String chocolateColor;

    public BountyBar(String name, double weight, double sugar, boolean isChocolate, double price, String chocolateColor) {
        super(name, weight, sugar, isChocolate, price);
        this.chocolateColor = chocolateColor;
    }

    public BountyBar() {
    }

    public String getChocolateColor() {
        return chocolateColor;
    }

    public void setChocolateColor(String chocolateColor) {
        this.chocolateColor = chocolateColor;
    }

    @Override
    public String toString() {
        return super.toString() +
                ",  chocolate color: " + chocolateColor + ".";
    }
}

package com.vlada.newyear.domain.Entity;

public class Cookie extends Sweets {
    private boolean isCrunch;

    public Cookie(String name, double weight, double sugar, boolean isChocolate, double price, boolean isCrunch) {
        super(name, weight, sugar, isChocolate, price);
        this.isCrunch = isCrunch;
    }

    public Cookie() {
    }

    public boolean isCrunch() {
        return isCrunch;
    }

    public void setCrunch(boolean crunch) {
        isCrunch = crunch;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Crunch: " + isCrunch + ".";
    }
}

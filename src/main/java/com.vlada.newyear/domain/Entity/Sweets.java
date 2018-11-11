package com.vlada.newyear.domain.Entity;

public class Sweets {
    private String name;
    private double weight;
    private double sugar;
    private boolean isChocolate;
    private double price;

    public Sweets(String name, double weight, double sugar, boolean isChocolate, double price) {
        this.name = name;
        this.weight = weight;
        this.sugar = sugar;
        this.isChocolate = isChocolate;
        this.price = price;
    }

    public Sweets() {
    }

    public String getName() {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("There is no such name in our gift");
        }

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight cannot be negative or equals to zero");
        }
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSugar() {
        if (sugar < 0) {
            throw new IllegalArgumentException("Contains of sugar cannot be negative");
        }
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public boolean isChocolate() {
        return isChocolate;
    }

    public void setChocolate(boolean chocolate) {
        isChocolate = chocolate;
    }

    public double getPrice() {
        if (price <= 0) {
            throw new IllegalArgumentException("Price cannot be negative. It cannot be free either");
        }
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "Name: " + name +
                        ", weight: " + weight +
                        ", sugar: " + sugar + "%" +
                        ", isChocolate: " + isChocolate +
                        ", price: " + price + " USD";
    }
}

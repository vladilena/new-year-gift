package com.vlada.newyear.service.Exceptions;

public class MyExceptions extends Exception {
    public static void negativePriceException() {
        System.err.println("Price cannot be negative");
    }
}

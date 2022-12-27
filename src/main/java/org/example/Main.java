package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Price price = new PriceObj("EURUSD");
        for (int i = 0; i < Price.DEFAULT_ARRAY_SIZE; i++) {
            price.push(new Random().nextInt(10000));
        }
        System.out.println(price.getName() + " " + price.top(5));
    }
}
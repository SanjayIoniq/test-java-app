package com.demo;

public class App {
    public static void main(String[] args) throws Exception {

        double basePrice = 1000;
        double tax = basePrice * 0.18;
        double discount = basePrice * 0.05;

        double finalPrice = basePrice + tax - discount;

        System.out.println("Final Price: " + finalPrice);

        // Keep container running (IMPORTANT for Kubernetes)
        while (true) {
            Thread.sleep(10000);
        }
    }
}
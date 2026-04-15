package com.demo;
public class App {
    public static void main(String[] args) {
        int units = 120;
        double bill = calculateBill(units);
        System.out.println("Units: " + units);
        System.out.println("Total Bill: " + bill);
        while(true){
            try {
                Thread.sleep(10000);
            } catch(Exception e){}
        }
    }
    public static double calculateBill(int units) {
        double bill = 0;
        if (units <= 100) {
            bill = units * 1.5;
        } else if (units <= 200) {
            bill = (100 * 1.5) + ((units - 100) * 2.5);
        } else {
            bill = (100 * 1.5) + (100 * 2.5) + ((units - 200) * 4);
        }
        return bill;
    }
}
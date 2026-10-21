package com.pluralsight;

public class Fighters {
    public static void main(String[] args) {

//        String[] fighters = { "Goku", "Gohan", "Vegeta"};
//        int[] numbers = {2,3,4,};
//        String fighter1 = "Goki";
//
//        for (int counter = 0; counter < fighters.length ; counter++);
//        System.out.println("Count: " + counter);
//        System.out.println(fighters[counter]);

        String amountOfMoneyLeoCasuallyCarriesInHisPocket = "12412.53";
        double amount = Double.parseDouble(amountOfMoneyLeoCasuallyCarriesInHisPocket);
        System.out.printf("Leo casually carries $%,.2f in his pocket", amount);
    }
}

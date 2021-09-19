/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Scott Schimpf
 */

import java.util.Scanner;

// Pseudocode
// The program accepts the price and quantity of each item and caculates the subtotal.
// Then the program uses a constant to calculate the tax and add it to the subtotal


class Solution10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        final double taxRate = .055;
        double subtotal = 0.0;
        double tax = 0.0;

        double price1 = 0.0;
        double price2 = 0.0;
        double price3 = 0.0;

        int quantity1 = 0;
        int quantity2 = 0;
        int quantity3 = 0;

        System.out.print("Please enter the quantity of item 1: ");
        quantity1 = scan.nextInt();
        System.out.print("\nPlease enter the price of item 1: ");
        price1 = scan.nextDouble();
        System.out.println();


        System.out.print("\nPlease enter the quantity of item 2: ");
        quantity2 = scan.nextInt();
        System.out.print("\nPlease enter the price of item 2: ");
        price2 = scan.nextDouble();
        System.out.println();


        System.out.print("\nPlease enter the quantity of item 3: ");
        quantity3 = scan.nextInt();
        System.out.print("\nPlease enter the price of item 3: ");
        price3 = scan.nextDouble();
        System.out.println();

        subtotal = (price1 * quantity1) + (price2 * quantity2) + (price3 * quantity3);
        tax = subtotal * taxRate;

        System.out.println("Subtotal: " + subtotal);
        System.out.println("Tax: " + tax);
        System.out.println("Total: " + (subtotal + tax));

    }
}
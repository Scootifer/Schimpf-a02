/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Scott Schimpf
 */

// The program accepts user input of the state and order amount and from there
// uses a constant variable to hold and use the tax amount, and uses the math library to round the price to pennies.
//


import java.util.Scanner;
import java.lang.Math;

class Solution14 {
    public static void main(String[] args) {

        final double WI_TAX = 0.055;

        Scanner scan = new Scanner(System.in);
        double orderAmt = 0.0;
        double taxAmt = 0.0;
        String state;

        System.out.print("Please enter the order amount: ");
        orderAmt = scan.nextDouble();
        System.out.print("\n");
        scan.nextLine();


        System.out.print("\nPlease enter the state: ");
        state = scan.nextLine();


        if (state.equalsIgnoreCase("wi")) {
            taxAmt = orderAmt * WI_TAX;
            System.out.println("Subtotal: $" + orderAmt);
            System.out.println("Tax: $" + ((double)Math.round(taxAmt * 100) / 100));

        }

        double roundedTotal = ((double)Math.round((orderAmt + taxAmt) * 100) / 100);

        System.out.println("Total: $" + roundedTotal);





    }
}
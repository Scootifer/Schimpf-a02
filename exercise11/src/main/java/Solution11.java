/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Scott Schimpf
 */

import java.util.Scanner;
import java.lang.Math;

// Pseudocode
// The program will accept the amount of euros the user has and how much each euro is worth in US $ and calculate the conversion
// The program will use Math.round's feature of rounding to the nearest int to determine if the number needs to be rounded.

class Solution11 {

    // round
    // Accepts the number to be rounded and the power of 10 (decimal place) to round to
    public static double round(double number, int powerOf10) {
        return (double)Math.round(number * Math.pow(10, powerOf10)) / Math.pow(10, powerOf10);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double euros = 0.0;
        double conversion = 0.0;
        double usd = 0.0;

        System.out.print("Please enter the amount of Euros you have: ");
        euros = scan.nextDouble();

        System.out.print("\nPlease enter the exchange rate: ");
        conversion = scan.nextDouble();

        usd = round((euros * conversion), 2);

        System.out.println(usd);

        System.out.println(euros + " Euros at $" + conversion + " USD to EUROS is: $" + usd + " USD");
    }
}
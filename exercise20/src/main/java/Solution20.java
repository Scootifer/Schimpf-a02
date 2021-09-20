/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Scott Schimpf
 */

import java.util.Scanner;
import java.lang.Math;

class Solution20 {

    // accept the total, state, and county and use if and nested-if statements to calculate and return the correct tax
    //
    double calculateTax(double total, String state, String county){

        final double WIS_TAX = 0.005;
        final double EAU_CLAIR_TAX = 0.005;
        final double DUNN_TAX = 0.004;
        final double ILL_TAX = 0.08;

        if(state.equalsIgnoreCase("wisconsin")) {

            if(county.equalsIgnoreCase("eau claire")) {
                return total * (EAU_CLAIR_TAX + WIS_TAX);
            }

            else if(county.equalsIgnoreCase("dunn")) {
                return total * (DUNN_TAX + WIS_TAX);
            }
            else {
                return total * WIS_TAX;
            }

        }
        if(state.equalsIgnoreCase("illinois")) {
            return total * ILL_TAX;
        }

        return 0.0;
    }


    // round
    // Accepts the number to be rounded and the power of 10 (decimal place) to round to
    double round(double number, int powerOf10) {
        return (double)Math.round(number * Math.pow(10, powerOf10)) / Math.pow(10, powerOf10);
    }

    // A revamp of assignment 14, this version uses a function to calculate the tax amount, given a total, state, and county
    //
    public static void main(String[] args) {

        final Solution20 obj = new Solution20();
        final Scanner scan = new Scanner(System.in);


        double orderAmt, taxAmt;
        String state;
        String county = "";

        System.out.print("Please enter the order amount: ");
        orderAmt = scan.nextDouble();
        scan.nextLine();

        System.out.print("\nPlease enter the state: ");
        state = scan.nextLine();

        if (state.equalsIgnoreCase("wisconsin")) {
            System.out.print("\nPlease enter the county: ");
            county = scan.nextLine();
        }

        taxAmt = obj.round(obj.calculateTax(orderAmt, state, county), 2);

        System.out.println("The tax is: $" + taxAmt);
        System.out.println("The total is: $" + obj.round((orderAmt + taxAmt), 2));
        scan.close();
    }
}
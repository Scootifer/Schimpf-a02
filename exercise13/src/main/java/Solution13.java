/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Scott Schimpf
 */
import java.util.Scanner;
import java.lang.Math;

// Pseudocode
// prompt user for the principle interest, interest rate, time in years, and compounds per year
// Use Math.round to round the number to the nearest penny. And Math.pow to raise to the power
//

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double principle = 0.0;
        double interest = 0.0;
        double length = 0.0;
        int compounds = 0;
        double result = 0.0;



        System.out.print("Enter the principle: $");
        principle = scan.nextDouble();

        System.out.print("\nEnter the interest rate: ");
        interest = scan.nextDouble()/100;

        System.out.print("\nEnter the length in years: ");
        length = scan.nextDouble();

        System.out.print("\nEnter the number of compounds per year: ");
        compounds = scan.nextInt();


        //separated for ease of reading
        double toRound = principle * Math.pow((1 + (interest/compounds)), (length*compounds) );


        result = ((double)Math.round(toRound * 100) / 100);

        System.out.println("After " + length + " years, $" + principle + " at " + interest*100 + "% a year, compounded " + compounds + " times each year becomes: $" + result );

    }
}
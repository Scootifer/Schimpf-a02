/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Scott Schimpf
 */

import java.util.Scanner;

public class Solution08 {

    // The program will prompt the user for how many people, pizzas, and slices per pizza there are
    // The program will then do the appropriate math and output
    // The remainder will be calculated with the modulus operator
    //
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numPeople = 0;
        int numPizzas = 0;
        int slicesPer = 0;
        int totalSlices = 0; //stored as int to avoid remainder


        System.out.print("How many people are there: ");
        numPeople = scan.nextInt();

        System.out.print("\nHow many pizzas are there: ");
        numPizzas = scan.nextInt();

        System.out.print("\nHow many slices per pizza: ");
        slicesPer = scan.nextInt();

        totalSlices = slicesPer * numPizzas;

        System.out.println("For " + numPeople + " people getting " + numPizzas + " pizzas (" + totalSlices + " slices) each person will get " + (totalSlices/numPeople) + " slices.");
        System.out.println("There will be " + (totalSlices%numPeople) + " slices of pizza remaining.");

        }
}

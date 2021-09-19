/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Scott Schimpf
 */
import java.util.Scanner;

class Solution18 {

    // Calculates celcius from fahrenheit
    double cFromF(double f) {
        return (f-32) * 5 / 9;
    }

    // Calculates fahrenheit from celcius
    double fFromC(double c) {
        return (c * 9 / 5) + 32;
    }

    //  The program will accept the users input and use the cFromF and fFromC functions
    //  to calculate the temperature conversion.
    //  Then it will use the ternary operator to build the output string


    public static void main(String[] args) {

        Solution18 obj = new Solution18();
        final Scanner scan = new Scanner(System.in);

        String character;
        double temp;
        String output;

        System.out.print("Enter [F] to convert Fahrenheit to Celcius \nOr [C] to convert Celcius to Fahrenheit: ");
        character = scan.next();
        scan.nextLine();

        System.out.print("\nPlease enter the temperature: ");
        temp = scan.nextDouble();

        output = character.equalsIgnoreCase("f")
                ? temp + "F in C is " +  obj.cFromF(temp)
                : temp + "C in F is " + obj.fFromC(temp);

        System.out.println(output);
        scan.close();


    }
}
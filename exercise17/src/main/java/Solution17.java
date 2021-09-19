/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Scott Schimpf
 */
import java.util.Scanner;

class Solution17 {

    final Scanner scan = new Scanner(System.in);

    // validateInput
    //  Accepts the input and what input type ('i', 'd') the input should be.
    //  returns 0 for invalid and 1 for valid
    public static int validateInput(String input, char type){

        if(type == 'd' ) {
            try{
                Double.parseDouble(input);
            }
            catch(Exception e){
                System.out.println("Please enter a double value");
                return 0;
            }
        }

        else if(type == 'i' ) {
            try{
                Integer.parseInt(input);
            }
            catch(Exception e){
                System.out.println("Please enter an integer value");
                return 0;
            }
        }

        return 1;
    }

    public static double getBAC(int A, double w, boolean isMale, int hours) {
        double r;
        if (isMale) {
            r = 0.73;
        }
        else {
            r = 0.66;
        }

        return (A * 5.14 / w * r) - 0.015 * hours;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input;

        boolean isMale;
        int alcConsumed;
        double weight;
        int hours;

        double BAC;

        do {
            System.out.print("Enter a '1' for male or '2' for female: ");
            input = scan.nextLine();
            if(validateInput(input, 'i') == 1) {
                isMale = input.equals("1") ? true : false;
                break;
            }
        }while(true);

        do {
            System.out.print("\nHow many ounces of alcohol were consumed: ");
            input = scan.nextLine();
            if(validateInput(input, 'i') == 1) {
                alcConsumed = Integer.parseInt(input);
                break;
            }
        }while(true);


        do {
            System.out.print("\nEnter your weight in pounds: ");
            input = scan.nextLine();
            if(validateInput(input, 'd') == 1) {
                weight = Double.parseDouble(input);
                break;
            }
        }while(true);


        do {
            System.out.print("\nHow many hours since the last drink: ");
            input = scan.nextLine();
            if(validateInput(input, 'i') == 1) {
                hours = Integer.parseInt(input);
                break;
            }
        }while(true);


        System.out.println();
        BAC = getBAC(alcConsumed, weight, isMale, hours);
        System.out.printf("\nYour BAC is %.6f\n", BAC);

        if(BAC >= 0.08) {
            System.out.println("You are not legally allowed to drive. ");
        }
        else{
            System.out.println("You are legally allowed to drive. ");
        }

    }
}
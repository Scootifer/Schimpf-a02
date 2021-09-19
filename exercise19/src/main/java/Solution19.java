/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Scott Schimpf
 */
import java.util.Scanner;
import java.lang.Math;

class Solution19 {

    // validateInput
    //  Accepts the input and what input type ('i', 'd') the input should be.
    //  returns 0 for invalid and 1 for valid
    int validateInput(String input, char type){

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

    // calculateBMI
    // accepts the users weight and height and returns their BMI
    double calculateBMI(double weight, double height) {
        return (weight / (height * height)) * 703;
    }


    // round
    // Accepts the number to be rounded and the power of 10 (decimal place) to round to
    // Returns the according rounding
    double round(double number, int powerOf10) {
        return (double)Math.round(number * Math.pow(10, powerOf10)) / Math.pow(10, powerOf10);
    }


    // The program accepts and validates the users input for weight and pounds
    // then it calculates and rounds their BMI and outputs accoringly using the ternary operator.
    //

    public static void main(String[] args) {

        final Solution19 obj = new Solution19();
        final Scanner scan = new Scanner(System.in);

        String input;
        String output = "";
        double weight, height, bmi;

        do {
            System.out.print("Enter your weight in pounds: ");
            input = scan.nextLine();
            if(obj.validateInput(input, 'd') == 1) {
                weight = Double.parseDouble(input);
                break;
            }
        }while(true);


        do {
            System.out.print("Enter your height in inches: ");
            input = scan.nextLine();
            if(obj.validateInput(input, 'd') == 1) {
                height = Double.parseDouble(input);
                break;
            }
        }while(true);

        bmi = obj.round(obj.calculateBMI(weight, height), 1);


        if(bmi >= 18.5 && bmi <= 25) {
            output = "BMI : " + bmi + ", You are a healthy weight.";
        }
        else if (bmi > 25) {
            output = "BMI : " + bmi + ", You are overweight and should see a doctor.";
        }
        else if (bmi < 18.5) {
            output = "BMI : " + bmi + ", You are underweight and should see a doctor.";
        }

        System.out.println(output);
        scan.close();


    }
}
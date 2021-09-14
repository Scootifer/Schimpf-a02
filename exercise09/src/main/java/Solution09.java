/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Scott Schimpf
 */

import java.util.Scanner;

// Pseudocode
// The program will accept the users input as a double, then calculate the area of the room.
// Then it will use the modulus operator to see if an extra gallon is needed. 


class Solution09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int ftPerGallon = 350;

        double length;
        double width;
        double area;

        System.out.print("Please enter the width of the room: ");
        width = scan.nextDouble();

        System.out.print("Please enter the length of the room: ");
        length = scan.nextDouble();

        area = (length * width);

        int gallonsNeeded = 0;
        if( area % ftPerGallon == 0){
            gallonsNeeded = (int)area/ ftPerGallon;
        }
        else {
            gallonsNeeded = (int)area / ftPerGallon;
            gallonsNeeded++;
        }


        System.out.println("A " + width + "ft wide by " + length + "ft long room would need " + gallonsNeeded + " gallons of paint. (" + area + "ft^2)");



    }
}
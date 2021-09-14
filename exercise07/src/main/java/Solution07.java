/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Scott Schimpf
 */

import java.util.Scanner;

public class Solution07 {

    //Prompt the user for the length and width of the room (As a double incase of decimals)
    //Using a constant conversion ratio calculate and store the area variables in areaFt and areaM


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        final double feetToMeters = 0.09290304;

        System.out.print("Please enter the length of the room (ft): ");
        double length = scan.nextDouble();

        System.out.print("\nPlease enter the width of the room (ft): ");
        double width = scan.nextDouble();

        double areaFt = width * length;
        double areaM = areaFt * feetToMeters;

        System.out.println();
        System.out.println("The room that is " + length + "ft long and " + width + "ft wide has a total area of:");
        System.out.println(areaFt + "ft^2");
        System.out.println(areaM + "m^2");
}

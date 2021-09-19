/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Scott Schimpf
 */

import java.util.Scanner;

//  Pseudocode
//  The program will accept user input of their age and user a ternary operator to decide the output string
//

class Solution16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input;
        String output;

        System.out.print("Please enter your age: ");
        input = scan.nextInt();

        output = input > 15 ? "You can legally drive." : "You cannot legally drive.";

        System.out.println(output);

        scan.close();
    }
}
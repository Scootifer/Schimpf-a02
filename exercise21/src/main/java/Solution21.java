/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Scott Schimpf
 */
import java.util.Scanner;

class Solution21 {

    public static void main(String[] args) {

        final Scanner scan = new Scanner(System.in);
        int month;
        String output = "";

        System.out.print("Please enter a month: ");
        month = scan.nextInt();

        switch(month) {
            case 1: output = "January"; break;
            case 2: output = "February"; break;
            case 3: output = "March"; break;
            case 4: output = "April"; break;
            case 5: output = "May"; break;
            case 6: output = "June"; break;
            case 7: output = "July"; break;
            case 8: output = "August"; break;
            case 9: output = "September"; break;
            case 10: output = "October"; break;
            case 11: output = "November"; break;
            case 12: output = "December"; break;
        }

        System.out.println("\nThe month " + month + " is " + output + ".");

    }
}
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Scott Schimpf
 */
import java.util.Scanner;

class Solution23 {

    // This problem was provided entirely in the documentation. Everything was encapsulated in if statements already.
    //

    public static void main(String[] args) {

        final Scanner scan = new Scanner(System.in);

        String input = "";

        System.out.print("Is the car silent when you turn the key? ");
        input = scan.nextLine();

        if(input.equalsIgnoreCase("yes")) {
            System.out.print("\nAre the battery terminals corroded? ");
            input = scan.nextLine();

            if(input.equalsIgnoreCase("yes")) {
                System.out.println("Clean the terminals and try starting again.");
                return;
            }
        }
        else {
            System.out.print("\nDoes the car make a slicking sound? ");
            input = scan.nextLine();

            if(input.equalsIgnoreCase("yes")) {
                System.out.println("Replace the batter.");
                return;
            }
            else {
                System.out.print("\nDoes the car crank up but fail to start? ");
                input = scan.nextLine();

                if(input.equalsIgnoreCase("yes")) {
                    System.out.println("Check the spark plug connection.");
                    return;
                }
                else {
                    System.out.print("\nDoes the engine start and then die? ");
                    input = scan.nextLine();

                    if(input.equalsIgnoreCase("yes")) {
                        System.out.print("\nDoes The car have fuel injection? ");
                        input = scan.nextLine();

                        if(input.equalsIgnoreCase("yes")) {
                            System.out.println("Get it in for service.");
                            return;
                        }
                        else {
                            System.out.println("Check to ensure the choke is opening and closing");
                            return;
                        }
                    }
                    else {
                        System.out.println("This should not be possible");
                    }// else haveInjector
                }// else failStart
            } //else slicksound
        }// else carSilent
    }
}
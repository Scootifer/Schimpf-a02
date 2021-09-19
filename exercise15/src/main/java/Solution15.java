/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Scott Schimpf
 */
import java.util.Scanner;

// The program will accept a username and password and from there run the combination through if statements to test validity.
//
//
class Solution15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String username, password;

        System.out.print("Please enter your username: ");
        username = scan.nextLine();

        System.out.print("\nPlease enter your password: ");
        password = scan.nextLine();

        if(username.equals("User1") && password.equals("password1")){
            System.out.println("Welcome User1");
        }
        else {
            System.out.println("Error: Username and password don't match");
        }

        scan.close();

    }
}
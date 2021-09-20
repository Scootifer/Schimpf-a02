/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Scott Schimpf
 */
import java.util.Scanner;
import java.util.ArrayList;

class Solution22 {

    // findLargest
    // Accepts a list of integers and loops through it asserting the largest variable
    // to any value larger than it. The variable is initialized to the first element in the list
    // The program will return -1 in the case of the arrayList being empty (Could cause confusion but will mostly work as intended)

    int findLargest(ArrayList<Integer> list){
        if(list.size() == 0) return -1;
        int largest = list.get(0);

        for(int i : list) {
            if(i > largest) {
                largest = i;
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);
        final Solution22 obj = new Solution22();
        final int USER_COUNT = 3;

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < USER_COUNT; i++) {
            System.out.print("Please enter number [" + (i+1) + "]: ");
            list.add(Integer.parseInt(scan.nextLine()));
        }
        System.out.println();

        System.out.println(obj.findLargest(list));
    }
}

import java.util.Scanner;
import java.util.Date;

/*
/ The program will request accept in the users age and age they want to retire as ints
/ Then it will calculate the remaining years to work until retirement
/ Finally it will use the date package to tell the user what year they wish to retire in
/
*/
public class Solution06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Date d = new Date();

        System.out.print("Please enter your age: ");
        int age = scan.nextInt();
        System.out.print("Please enter the age you would like to retire: ");
        int retire = scan.nextInt();
        int remainingTime = retire-age;

        int currentYear = d.getYear() + 1900;
        System.out.println("You will be able to retire in " + remainingTime + " years.");
        System.out.println("As of " + currentYear + " you will be able to retire in " + (currentYear + remainingTime));


    }
}

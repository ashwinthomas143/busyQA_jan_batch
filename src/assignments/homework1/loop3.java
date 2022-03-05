//Provided by Thomas Ashwin Varghese
// To BusyQA - Simran and Harsha

package assignments.homework1;

import java.util.Scanner;

public class loop3 {
    public static void main(String[] args) {

        System.out.println("What month is it? ");
        Scanner scan = new Scanner(System.in);
        String month = scan.nextLine();


        int days = 0;
        switch (month) {
            case "Jan" :
            case "January" :
            case "Mar" :
            case "March" :
            case "May" :
            case "Jly" :
            case "July" :
            case "Aug" :
            case "August" :
            case "Oct" :
            case "October" :
            case "Dec" :
            case "December" :
                days = 31;
                System.out.println("There are " + days + " days.");
                break;
            case "Feb" :
            case "February" :
                days = 28;
                System.out.println("There are " + days + " days.");
                break;
            case "Apr" :
            case "April" :
            case "June" :
            case "Sept" :
            case "September" :
            case "Nov" :
            case "November" :
                days = 30;
                System.out.println("There are " + days + " days.");
                break;
            default:
                System.out.println("Invalid month. Please run program again.");
        }

    }
}

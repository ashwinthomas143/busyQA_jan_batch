//Provided by Thomas Ashwin Varghese
// To BusyQA - Simran and Harsha

package homework1;

import java.util.Scanner;

public class loop4 {
    public static void main(String[] args) {

        System.out.println("What year is it?");
        Scanner scan = new Scanner(System.in);

        int year = scan.nextInt();


        if(year % 400 == 0){
            System.out.println(year + " is a leap year.");
        }else if(year % 100 == 0){
            System.out.println(year + " is not a leap year.");
        }else if(year % 4 == 0){
            System.out.println(year + " is a leap year.");
        }else{
            System.out.println(year + " is not a leap year.");
        }


    }
}

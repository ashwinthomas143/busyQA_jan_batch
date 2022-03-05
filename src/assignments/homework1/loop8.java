//Provided by Thomas Ashwin Varghese
// To BusyQA - Simran and Harsha

package assignments.homework1;

import java.util.Scanner;

public class loop8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(("Enter a number:"));

        int number = scan.nextInt();
        System.out.println("The number entered is " +  number);
        int number1 = number;
        int backwards = 0;

        while(number != 0){

            int num1 = number % 10;
            backwards = backwards * 10 + num1;

            number = number / 10;
        }

        System.out.println("The reversed number is " +  backwards);

        if(number1 == backwards){
            System.out.println("The number entered is a palindrome");
        }else{
            System.out.println("The number entered is not a palindrome");
        }
    }
}

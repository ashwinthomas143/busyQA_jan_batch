//Provided by Thomas Ashwin Varghese
// To BusyQA - Simran and Harsha

package homework1;

import java.util.Scanner;

public class loop9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(("Enter a number:"));

        int number = scan.nextInt();
        int num1 = number;
        System.out.println("The number entered is " +  number);
        int prod = 1;

        while(number != 1){
            prod = prod * number;
            number --;
        }
        System.out.println("The factorial of the " + num1 + " is " +  prod);


    }
}

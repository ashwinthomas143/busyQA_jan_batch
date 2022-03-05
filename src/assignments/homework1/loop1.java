//Provided by Thomas Ashwin Varghese
// To BusyQA - Simran and Harsha

package assignments.homework1;

import java.util.Scanner;

public class loop1 {
    public static void main(String[] args) {
        System.out.println("Enter a number, positive or negative: ");
        Scanner scan = new Scanner(System.in);
        float number = scan.nextFloat();

        if(number > 0){
            System.out.println(number + " is a positive number.");
        }else{
            System.out.println(number + " is a negative number.");
        }

    }
}

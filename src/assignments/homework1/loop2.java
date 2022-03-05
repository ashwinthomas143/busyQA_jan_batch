//Provided by Thomas Ashwin Varghese
// To BusyQA - Simran and Harsha

package assignments.homework1;

import java.util.Scanner;

public class loop2 {
    public static void main(String[] args) {
        double a = 0, b = 0, c = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        a = scan.nextDouble();
        System.out.println("Enter the second number: ");
        b = scan.nextDouble();
        System.out.println("Enter the third number: ");
        c = scan.nextDouble();

        if (a == b && a==c) {
            System.out.println("Since all the numbers are the same, the greatest number of the 3 is " + a);
        }else if (a == b) {
            if (a > c) {
                System.out.println("The greatest number of the 3 is " + a);
            } else {
                System.out.println("The greatest number of the 3 is " + c);
            }
        } else if (a == c) {
            if (a > b) {
                System.out.println("The greatest number of the 3 is " + a);
            } else {
                System.out.println("The greatest number of the 3 is " + b);
            }
        } else if (b == c) {
            if (a > b) {
                System.out.println("The greatest number of the 3 is " + a);
            } else {
                System.out.println("The greatest number of the 3 is " + b);
            }
        } else if (a == b && a==c) {
            System.out.println("Since all the numbers are the same, the greatest number of the 3 is " + a);
        }else if (a != b & a != c) {
            if (a > b && a > c) {
                System.out.println("The greatest number of the 3 is " + a);
            } else if (b > c && b > a) {
                System.out.println("The greatest number of the 3 is " + b);
            } else {
                System.out.println("The greatest number of the 3 is " + c);
            }
        }
    }
}

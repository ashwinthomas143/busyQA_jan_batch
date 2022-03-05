//Provided by Thomas Ashwin Varghese
// To BusyQA - Simran and Harsha

package assignments.homework1;

import java.util.Scanner;

public class loop5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Write an integer for which you want to know the tables of : ");
        int number = scan.nextInt();

        for(int i = 0; i <=10; i ++){
            System.out.println( number + " x " + i + " = " + (number*i));
        }






    }
}

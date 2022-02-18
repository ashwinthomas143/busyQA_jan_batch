package homework1;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

//Provided by Thomas Ashwin Varghese
// To BusyQA - Simran and Harsha

public class loop7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(("Enter a number:"));

        int number = scan.nextInt();
        int backwards = 0;

        while(number != 0){

            int num1 = number % 10;
            backwards = backwards * 10 + num1;

            number = number / 10;
        }
        System.out.println("The reversed number is " +  backwards);

    }

    }

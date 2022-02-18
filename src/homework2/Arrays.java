//Provided by Thomas Ashwin Varghese
// To BusyQA - Simran and Harsha

package homework2;

import java.sql.SQLOutput;

public class Arrays {
    public static void main(String[] args) {
        int[] integerArrays = {1, 2, 3, 4, 8, 9, 14};
        int sum = 0;
        int count = 0;

        System.out.println("Array: 1, 2, 3, 4, 8, 9, 14");


        //Sum of an Array
        for (int integerArray : integerArrays) {
            sum += integerArray;
            count++;
        }
        System.out.println("The sum of the array is " + sum);

        //Average of an Array
        double average = (double) sum / count;
        System.out.println("The average of the array is " + average);

        //Even numbers of an Array
        System.out.println("The even numbers of the array are : ");

        for (int i = 0; i < integerArrays.length; i++) {
            if (integerArrays[i] % 2 == 0) {
                System.out.print(integerArrays[i] + "\t");
            }
        }

        System.out.println();

        //Odd numbers of an Array
        System.out.println("The odd numbers of the array are : ");

        for (int i = 0; i < integerArrays.length; i++) {
            if (integerArrays[i] % 2 == 1) {
                System.out.print(integerArrays[i] + "\t");
            }
        }
        System.out.println();

        //Largest number of an Array
        System.out.print("The largest number of the array is : ");
        int largestNumber = 0;

        for (int i = 0; i < integerArrays.length; i++) {
            if (integerArrays[i] > largestNumber) {
                largestNumber = integerArrays[i];
            }
        }
        System.out.println(largestNumber);

        //Smallest number of an Array
        System.out.print("The smallest number of the array is : ");
        int smallestNumber = integerArrays[0];

        for (int i = 0; i < integerArrays.length; i++) {
            if (integerArrays[i] < smallestNumber) {
                smallestNumber = integerArrays[i];
            }
        }
        System.out.println(smallestNumber);


        //Find duplicate elements of an array
        int[] newArray = {1, 2, 3, 4, 1};
        for (int i = 0; i < newArray.length; i++) {
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[i] == newArray[j]) {
                    System.out.println("The repeated element of the array is : " + newArray[j]);
                }
            }
        }

    }
}

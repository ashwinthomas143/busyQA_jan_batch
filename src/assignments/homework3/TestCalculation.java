//Provided by Thomas Ashwin Varghese
// To BusyQA - Simran and Harsha

package assignments.homework3;

public class TestCalculation {
    public static void main(String[] args) {

        Calculation cal = new Calculation(1, 2);
        Calculation cal1 = new Calculation(1, 2, 3);

        Calculation cal2 = new Calculation(1.0, 2.0);
        Calculation cal3 = new Calculation(1.0, 2.0, 3.0);

        System.out.println(cal.sum);
        System.out.println(cal1.sum);
        System.out.println(cal2.sum1);
        System.out.println(cal3.sum1);


    }
}

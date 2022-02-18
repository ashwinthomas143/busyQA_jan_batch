//Provided by Thomas Ashwin Varghese
// To BusyQA - Simran and Harsha

package homework3;

public class Calculator {

    static int a;
    static int b;
    static int c;

    void Calculator(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    static double sum() {
        double sum = a + b + c;
        return sum;
    }

    public void main(String[] args) {
        Calculator add = new Calculator();
        add.a = 9;
        add.b = 12;
        add.c = 18;

        System.out.println(Calculator.sum());

    }
}

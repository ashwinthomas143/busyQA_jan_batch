package assignments.homework4interfaces;

public class Q2ClassC implements Q2InterfaceA, Q2InterfaceB {

    int a, b, x, y;


    public void add(int a1, int b1) {
        this.a = a1;
        this.b = b1;
        int sumOfAandB = a + b;
        System.out.println("The sum of " + a + " and " + b + " is " + sumOfAandB);
    }



    public void mul(int a2, int b2) {
        this.x = a2;
        this.y = b2;
        int prodOfXandY = a * b;
        System.out.println("The product of " + x + " and " + y + " is " + prodOfXandY);
    }


}

package assignments.homework4interfaces;

public class Q1ClassB implements Q1InterfaceA {
    int x, y;

    public Q1ClassB(int i, int i1) {
        this.x = i;
        this.y = i1;
    }


    public void sum() {

        int sumOfAandB = x + y;
        System.out.println("The sum of " + x + " and " + y + " is " + sumOfAandB);
    }


}

package homework5;

public class q1 {
    public static void main(String[] args) {

        //divide by zero
        int a = 5;
        int b = 0;

        try {
            System.out.println(a / b);
        } catch (ArithmeticException ae) {
            System.out.println(ae);
        }

        System.out.println();

        //null array
        int c[] = null;
        try {
            System.out.println(c.length);
        }catch(NullPointerException npe ){
            System.out.println(npe);
        }

        System.out.println();

        //array out of bounds example
        int d[] = {1,2,3,40};

        try {
            System.out.println(d[10]);
        }catch(ArrayIndexOutOfBoundsException aiob){
            System.out.println(aiob);
        }

    }
}

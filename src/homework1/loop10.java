//Provided by Thomas Ashwin Varghese
// To BusyQA - Simran and Harsha

package homework1;

public class loop10 {
    public static void main(String[] args) {

        int n1 =1,n2 = 1,n3 =2;
        int sum = 0;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        while(n3 <50){
            sum = n3 + n2;
            n2 = n3;
            n3 = sum;
            System.out.println(n2);
        }
    }
}

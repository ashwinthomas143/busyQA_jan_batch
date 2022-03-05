package assignments.homework5;

public class q2 {

    static void ageToVote(int age) {
        if(age<18){
            throw new ArithmeticException("This person cannot vote as he/she is underage.");
        }else{
            System.out.println("This person can vote");
        }
    }
    public static void main(String[] args) {

        ageToVote(18);

    }
}

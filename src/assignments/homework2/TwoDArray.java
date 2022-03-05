//Provided by Thomas Ashwin Varghese
// To BusyQA - Simran and Harsha

package assignments.homework2;

public class TwoDArray {
    public static void main(String[] args) {

        //Find out average of two student
        double[][] scores = {{78, 84, 90}, {84, 90, 75}};

        double student1totalscore = 0;
        double student2totalscore = 0;
        double student1averagescore = 0;
        double student2averagescore = 0;
        for (int i = 0, j = 0; j <= scores.length; j++) {
            student1totalscore += scores[i][j];
        }
        student1averagescore = student1totalscore / scores[0].length;

        for (int i = 1, j = 0; j <= scores.length; j++) {
            student2totalscore += scores[i][j];
        }
        student2averagescore = student2totalscore / scores[1].length;
        //Reporting Scores of two students

        System.out.println("The scores of student 1 : ");
        for (int i = 0, j = 0; j <= scores.length; j++) {
            System.out.print(scores[i][j] + "\t");
        }
        System.out.println();
        System.out.println("The average score of student 1 is : " + student1averagescore);

        System.out.println();

        System.out.println("The scores of student 2 : ");
        for (int i = 1, j = 0; j <= scores.length; j++) {
            System.out.print(scores[i][j] + "\t");
        }
        System.out.println();
        System.out.println("The average score of student 2 is : " + student2averagescore);
        System.out.println();

        //Add two matrices using 2d array
        int matrix1[][] = {{1, 2, 3}, {4, 5, 6}};
        int matrix2[][] = {{7, 8, 9}, {10, 11, 12}};
        int sum[][] = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("The first matrix is : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("The second matrix is : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("The sum of the two matrices is : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }


    }
}

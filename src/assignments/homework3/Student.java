//Provided by Thomas Ashwin Varghese
// To BusyQA - Simran and Harsha

package assignments.homework3;

public class Student {

    public static void main(String[] args) {

        Student thomas = new Student();
        thomas.SID = 123;
        thomas.Sname = "Thomas";
        thomas.Sub1 = 85;
        thomas.Sub2 = 79;
        thomas.Sub3 = 89;

        thomas.getStuData(thomas.SID, thomas.Sname);
        thomas.getStuMarks(thomas.Sub1, thomas.Sub2, thomas.Sub3);
        thomas.totalMarks(thomas.Sub1, thomas.Sub2, thomas.Sub3);

        System.out.println();

        Student michael = new Student();
        michael.SID = 123;
        michael.Sname = "Michael";
        michael.Sub1 = 81;
        michael.Sub2 = 79;
        michael.Sub3 = 83;

        thomas.getStuData(michael.SID, michael.Sname);
        thomas.getStuMarks(michael.Sub1, michael.Sub2, michael.Sub3);
        thomas.totalMarks(michael.Sub1, michael.Sub2, michael.Sub3);
    }

    int SID;
    String Sname;
    double Sub1, Sub2, Sub3;

    public void getStuData(int SID, String Sname) {
        System.out.println("The student's ID is " + SID);
        System.out.println("The student's name is " + Sname);
    }

    public void getStuMarks(double Sub1, double Sub2, double Sub3) {
        System.out.println("The student's first mark is " + Sub1);
        System.out.println("The student's second mark is " + Sub2);
        System.out.println("The student's third mark is " + Sub3);
    }

    public void totalMarks(double Sub1, double Sub2, double Sub3) {
        double totalMarks = Sub1 + Sub2 + Sub3;

        System.out.println("The student's total mark is " + totalMarks);
        System.out.println("The student's average mark is " + totalMarks / 3);

    }


}

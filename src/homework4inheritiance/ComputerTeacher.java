package homework4inheritiance;

public class ComputerTeacher extends Teacher {
    String name = "Thomas";
    String subject = "Computer Science";

    void does() {
        System.out.println(name + " teaches " + subject + " at " + this.collegeName);
    }
}

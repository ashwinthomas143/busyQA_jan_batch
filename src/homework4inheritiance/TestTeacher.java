package homework4inheritiance;

public class TestTeacher {
    public static void main(String[] args) {
        Teacher teach = new Teacher();
        teach.does();
        Teacher supervisor = new Teacher();

        supervisor.designation = "Supervisor";
        supervisor.collegeName = "BusyQA";
        supervisor.does();

        ComputerTeacher compsciteach = new ComputerTeacher();
        compsciteach.does();

    }
}

package homework4inheritiance;

public class Teacher {

    String designation = "Teacher";
    String collegeName = "BusyQA";

    void does() {
        System.out.println(designation +" teaches at : " + collegeName);
    }

    void does(String designation, String collegeName) {
        System.out.println(designation +" teaches at : " + collegeName);
    }
}

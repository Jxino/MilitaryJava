package classpart;

public class Student {
    int studentID;
    String studentName;
    int grade;
    String address;

    public void showStudentInfo() {
        System.out.println(studentName + "," + address);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.studentName = "Usman";

        System.out.println(s1.studentName);
        System.out.println(s1.getStudentName());

         
    }
}
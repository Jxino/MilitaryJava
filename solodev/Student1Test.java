package solodev;

class Student1 {
    public static int serialNum = 1000;
    public int studentID;
    public String studentName;
    public int grade;
    public String address;

    public Student1() {
        studentID = serialNum++;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String name) {
        this.studentName = name;
    }
}

public class Student1Test {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        System.out.println(s1.studentID);
    }
}
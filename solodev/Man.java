package solodev;

public class Man {
    public int age;
    public String name;
    public boolean isMarried;
    public int numberOfChildren;

    public Man(int age, String name, boolean isMarried, int numberOfChildren) {
        this.age = age;
        this.name = name;
        this.isMarried = isMarried;
        this.numberOfChildren = numberOfChildren;
    }

    public void printInformation() {
        System.out.println(this.age);
        System.out.println(this.name);
        System.out.println(this.isMarried);
        System.out.println(this.numberOfChildren);
    }

    public static void main(String[] args) {
        Man m1 = new Man(40, "James", true, 3);
        m1.printInformation();
    }
}

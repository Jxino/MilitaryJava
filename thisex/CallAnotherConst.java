package thisex;

class Person {
    String name;
    int age;

    Person() {
        this("No name", 1);
    }
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name : " + this.name + " age : " + this.age;
    }

    public Person returnItself() {
        return this;
    }
}

public class CallAnotherConst {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.toString());
        
        Person p = p1.returnItself();
        System.out.println(p1);
        System.out.println(p);
    }
}
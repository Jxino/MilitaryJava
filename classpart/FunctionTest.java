package classpart;

public class FunctionTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        /*
        int sum = add(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + sum + "입니다");
         */
        
        // System.out.println(subtract(num1, num2));
        // System.out.println(multiply(num1, num2));
        System.out.println(divide(num1, num2));
    }

    public static int add(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }

    public static int subtract(int n1, int n2) {
        int result = n1 - n2;
        return result;
    }

    public static int multiply(int n1, int n2) {
        int result = n1 * n2;
        return result;
    }

    public static int divide(int n1, int n2) {
        try {
            return n1 / n2;
        } catch (ArithmeticException e) {
            System.out.println("printStackTrace");
            e.printStackTrace();
            System.out.println("\ngetMessage");
            System.out.println(e.getMessage());
            System.out.println("\ntoString");
            System.out.println(e.toString());
            return -999;
        }
    }
}
package solodev;

public class ExMatrix {
    public static void main(String[] args) {
        for (int i = 65; i < 90; i += 2) {
            for (int j = 0; j < 2; j++) {
                System.out.print((char) (i + j));
            }
            System.out.println();
        }
    }
}
import java.util.Scanner;

public class PascalsTriangleGenerator {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        int rows = s1.nextInt();

        System.out.println("Pascal's Triangle:");

        for (int i = 0; i < rows; i++) {
            int value = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value = value * (i - j) / (j + 1);
            }
            System.out.println();
        }
        s1.close();
    }
}
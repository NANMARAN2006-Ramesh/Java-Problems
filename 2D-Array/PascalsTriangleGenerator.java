import java.util.Scanner;

public class PascalsTriangleGenerator {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        int rows = s1.nextInt();
        int [][] pascal = new int[rows][];

        for (int i = 0; i < rows; i++) {
            pascal[i] = new int[i+1];
            int value = 1;

            for (int j = 0; j <= i; j++) {
                pascal[i][j] = value;
                value = value * (i - j) / (j + 1);
            }
        }

        System.out.println();
        System.out.println("Pascal's Triangle:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<pascal[i].length;j++){
                System.out.print(pascal[i][j]+" ");
            }
            System.out.println();
        }

        s1.close();
    }
}
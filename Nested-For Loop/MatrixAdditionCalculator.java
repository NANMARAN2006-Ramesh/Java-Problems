import java.util.Scanner;

public class MatrixAdditionCalculator {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter the row and coloumn: ");
        int row = s1.nextInt();
        int coloumn = s1.nextInt();
        int [][] matrixA = new int[row][coloumn];
        int [][] matrixB = new int[row][coloumn];
        int [][] matrixSum = new int[row][coloumn];
        System.out.println("Enter the matrixA elements: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<coloumn;j++){
                matrixA[i][j] = s1.nextInt();
            }
        }
        System.out.println("Enter the matrixB element: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<coloumn;j++){
                matrixB[i][j] = s1.nextInt();
            }
        }
        System.out.println();
        System.out.println("Matrix A: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<coloumn;j++){
                System.out.print(matrixA[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Matrix B:");
        for(int i=0;i<row;i++){
            for(int j=0;j<coloumn;j++){
                System.out.print(matrixB[i][j]+" ");

                matrixSum[i][j] = matrixA[i][j]+matrixB[i][j];
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Sum (A + B)");
        for(int i=0;i<row;i++){
            for(int j=0;j<coloumn;j++){
                System.out.print(matrixSum[i][j]+" ");
            }
            System.out.println();
        }

        s1.close();
    }
}

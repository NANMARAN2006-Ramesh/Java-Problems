import java.util.Scanner;

public class MatrixMultiplicationCalculator {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the matrix a row and col");
        int r1 = s1.nextInt();
        int c1 = s1.nextInt();
        int[][] A = new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                A[i][j] = s1.nextInt();
            }
        }
        
        System.out.println("Enter th matrix b row and col");
        int r2 = s1.nextInt();
        int c2 = s1.nextInt();
        int[][] B = new int[r2][c2];
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                B[i][j] = s1.nextInt();
            }
        }

        System.out.println("Matrix A:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Matrix B:");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Result Matrix:");
        if(c1 != r2){
            System.out.println("Invalid Multiplication Dimensions");
        }

        else{
            int[][] result = new int[r1][c2];
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    for(int k=0;k<c1;k++){
                        result[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    System.out.print(result[i][j]+" ");
                }
                System.out.println();
            }
        }
        s1.close();
    }
}
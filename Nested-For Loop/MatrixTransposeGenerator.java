import java.util.Scanner;

public class MatrixTransposeGenerator {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the matrix row and column size, 1 to 8");
        int rows = s1.nextInt();
        int column = s1.nextInt();

        int [][] matrix = new int[rows][column];

        System.out.println("Enter the matrix values");
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                matrix[i][j] = s1.nextInt();
            }
        }

        System.out.println("Original Matrix ("+rows + " x "+column+")");
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
               System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        int [][] transposed = new int[column][rows];
        System.out.println("Transposed Matrix ("+column+" x "+rows+")");
        for(int j=0;j<column;j++){
            for(int i=0;i<rows;i++){
                transposed[j][i] = matrix[i][j];
            }
        }
        for(int j=0;j<column;j++){
            for(int i=0;i<rows;i++){
                System.out.print(transposed[j][i]+" ");
            }
            System.out.println();
        }

        s1.close();
    }
}

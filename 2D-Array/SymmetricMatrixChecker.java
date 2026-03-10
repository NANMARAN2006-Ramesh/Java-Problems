import java.util.Scanner;

public class SymmetricMatrixChecker {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        int n = s1.nextInt();
        int[][] matrix = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = s1.nextInt();
            }
        }

        boolean isSymmetric = true;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(matrix[i][j] != matrix[j][i]){
                    isSymmetric = false;
                    break;
                }
            }
        }

        System.out.println("Matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        if(isSymmetric){
            System.out.println("\nStatus: Symmetric");
        } else {
            System.out.println("\nStatus: Asymmetric");
        }
        s1.close();
    }
}
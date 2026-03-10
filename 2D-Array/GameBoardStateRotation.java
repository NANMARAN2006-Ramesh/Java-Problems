import java.util.Scanner;

public class GameBoardStateRotation {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the row and col");
        int row = s1.nextInt();

        int [][] matrix = new int[row][row];

        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                matrix[i][j] = s1.nextInt();
            }
        }

        int [][] rotatedMatrix = new int[row][row];

        int count = 0;
        for(int i=row-1;i>=0;i--){
            int count1 = 0;
            for(int j=0;j<row;j++){
                rotatedMatrix[count1][count] = matrix[i][j];
                count1++;
            }
            count++;
        }

        System.out.println();
        System.out.println("Original Matrix: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Rotated Matrix (90 deg clockwise):");
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                System.out.print(rotatedMatrix[i][j]+" ");
            }
            System.out.println();
        }
        s1.close();
    }
}

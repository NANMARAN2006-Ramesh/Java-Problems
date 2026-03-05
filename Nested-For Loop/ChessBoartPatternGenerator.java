import java.util.Scanner;

public class ChessBoartPatternGenerator {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the board size, 4 to 12, must be even");
        int boardSize = s1.nextInt();

        for(int i=1;i<=boardSize;i++){
            for(int j=1;j<=boardSize;j++){
                if((i%2!=0 && j%2!=0)|| (i%2==0 && j%2==0)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        s1.close();
    }
}

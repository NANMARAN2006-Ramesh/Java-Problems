import java.util.Scanner;

public class DiamondPatternGenerator {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the diamond size, odd number 3 to 15");
        int size = s1.nextInt();
        int mid = size/2;
        for(int i=0;i<=mid;i++){
            for(int k=0;k<mid-i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<(2*i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=mid-1;i>=0;i--){
            for(int k=0;k<mid-i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<(2*i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        s1.close();
    }
}

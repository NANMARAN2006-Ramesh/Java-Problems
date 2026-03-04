import java.util.Scanner;

public class NumberPyramidPattern {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the pyramid height, 1 to 10");
        int height = s1.nextInt();

        for(int i=1;i<=height;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            if(i>1){
                for(int k=i-1;k>=1;k--){
                    System.out.print(k);
                }
            }
            System.out.println();
        }
        s1.close();
    }
}

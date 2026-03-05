import java.util.Scanner;

public class HellowRectanglePattern {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the rectangle height, 3 to 15");
        int height = s1.nextInt();
        System.out.println("Enter the rectangle width, 3 to 15");
        int width = s1.nextInt();

        for(int i=1;i<=height;i++){
            if((i==1)||(i==height)){
                for(int j=1;j<=width;j++){
                    System.out.print("*");
                }
            }
            else{
                for(int k=1;k<=2;k++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        s1.close();
    }
}

import java.util.Scanner;

public class MultiplicationTableGenerator {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the table row (1 to 12)");
        int row = s1.nextInt();
        System.out.println("Enter the table columns (1 to 12)");
        int columns = s1.nextInt();

        System.out.println("multiplication Table ("+ row+" "+columns+ " )");
        for(int i=1;i<=columns;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i=1;i<=row;i++){
            System.out.print(i+" ");
            for(int j=1;j<=columns;j++){    
                int mul = j*i;
                System.out.print(mul+" ");
            }
            System.out.println();
        }
        s1.close();
    }
}

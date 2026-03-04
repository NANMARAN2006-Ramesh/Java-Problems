import java.util.Scanner;

public class NumberPatterPrinter1 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the number of rows");
        int rows = s1.nextInt();

        int i = 1;
        do{
            int j = 1;
            while(j<=i){
                System.out.print(i+" ");
                j++;
            }
            System.out.println();
            i++;
        }while(i<=rows);
        s1.close();
    }
}

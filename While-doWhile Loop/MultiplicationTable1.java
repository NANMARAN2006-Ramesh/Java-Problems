import java.util.Scanner;

public class MultiplicationTable1 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the multiplication Table");
        int table = s1.nextInt();
        System.out.println("Enter the range");
        int range = s1.nextInt();
        int i = 1;
        do{
            int mul = i*table;
            System.out.println(table+" x "+i+" = "+mul);
            i++;
        }while(i<=range);
        s1.close();
    }
}

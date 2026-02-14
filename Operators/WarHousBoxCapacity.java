import java.util.Scanner;

public class WarHousBoxCapacity {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the base Boxes");
        int baseBox = s.nextInt();
        System.out.println("Enter the levels");
        int levels = s.nextInt();

        int total = baseBox<<levels;
        System.out.println("The total capacity = "+total);
        s.close();
    }
}

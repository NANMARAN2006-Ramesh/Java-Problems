import java.util.Scanner;

public class BinarytoDecimalConverteer {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the binary value");
        int binary = s1.nextInt();
        int original = binary;

        int decimal = 0;
        int base = 1;
        while (binary>0) {
            int rem = binary%10;
            int power = base*rem;
            decimal = decimal+power;
            base = base*2;
            binary/=10;
        }
        System.out.println("Binary: "+original);
        System.out.println("Decimal: "+decimal);
        s1.close();
    }
}

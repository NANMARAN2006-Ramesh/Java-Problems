import java.util.Scanner;

public class Calculator {
    public static int add(int a, int b){
        return a+b;
    }
    public static int mul(int a, int b){
        return a*b;
    }
    public static int div (int a, int b){
        return a/b;
    }
    public static int sub(int a, int b){
        return a-b;
    }
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the two numbers");
        int a = s1.nextInt();
        int b = s1.nextInt();

        int res1 = add(a,b);
        int res2 = sub(a, b);
        int res3 = mul(a, b);
        int res4 = div(a, b);
        System.out.println("Add : "+res1);
        System.out.println("Sub : "+res2);
        System.out.println("Mul : "+res3);
        System.out.println("Div : "+res4);

        s1.close();
    }
}

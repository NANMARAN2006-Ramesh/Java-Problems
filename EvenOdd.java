import java.util.Scanner;
public class EvenOdd {
    public static String evenOdd(int num){
        String res1 = "";
        if(num%2==0){
            res1 = "Even NUmber";
        }
        else{
            res1 = "Odd Number";
        }
        return res1;
    }
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = s1.nextInt();

        String res =  evenOdd(num);
        System.out.println(res);

        s1.close();
    }
}

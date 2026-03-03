import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = s1.nextInt();
        int temp = number;

        int sum = 0;
        while(temp!=0){
            int fact = 1;
            int rem = temp%10;
            for(int i=1;i<=rem;i++){
                fact=fact*i;
            }
            sum = sum+fact;
            temp/=10;
        }
        if(sum==number){
            System.out.println(number+" is a strong number");
        }
        else{
            System.out.println(number+" is not a strong number");
        }
        s1.close();
    }
}

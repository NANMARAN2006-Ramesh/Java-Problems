import java.util.Scanner;

public class SumOfEvenNumbers1 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        
        System.out.println("Enter the starting range");
        int start = s1.nextInt();
        System.out.println("Enter the ending range");
        int end = s1.nextInt();

        int sum = 0;
        while(start<=end){
            if(start%2==0){
                sum = sum+start;
            }
            start++;
        }
        System.out.println("Sum of even numner from "+start+" to "+end+" : "+sum);
        s1.close();
    }
}

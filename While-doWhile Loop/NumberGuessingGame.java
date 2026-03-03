import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        int count = 0;
        System.out.println("Enter the secret Number: ");
        int secretNumber = s1.nextInt();
        int guess = -1;
        while(guess!=secretNumber){
            count++;
            System.out.println("Guess the number (1100)");
            guess = s1.nextInt();
            if(guess>secretNumber){
                System.out.println("Too high!");
            }
            else if(guess<secretNumber){
                System.out.println("Too low!");
            }
            else{
                if(guess==secretNumber){
                    System.out.println("Correct! Attempts: "+count);
                    break;
                }
            }
        }
        s1.close();
    }
}

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the correctPassword");
        String correctPassword = s1.nextLine();
        boolean loggedIn = false;
        int maxAttempt = 3;
        while(maxAttempt!=0){
            System.out.println("Enter the password: ");
            String password = s1.nextLine();
            if(password.equals(correctPassword)){
                System.out.println("Access Granted!");
                loggedIn = true;
            }
            else{
                if(maxAttempt!=1){
                    System.out.println("Incorrect! Attempts remaining: "+(maxAttempt-1));
                }
            }
            maxAttempt--;
        }
        if(!loggedIn){
            System.out.println("Account Locked!");
        }
        s1.close();
    }
}

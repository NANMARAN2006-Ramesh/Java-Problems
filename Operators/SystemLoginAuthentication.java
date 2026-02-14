import java.util.*;
public class SystemLoginAuthentication {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the username only 1 or 0");
        int username = s.nextInt();
        System.out.println("Enter the password only 1 or 0");
        int password = s.nextInt();
        System.out.println("Enter the account detail 1 or 0");
        int account = s.nextInt();

        if(username!=0 && password!=0){
            if(username==password && account!=1){
                System.out.println("Sucess");
            }
            else{
                System.out.println("Failed");
            }
        }
        else{
            System.out.println("Failed");
        }
        s.close();
    }
}
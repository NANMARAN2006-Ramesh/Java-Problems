import java.util.*;

public class EmailValidator {
    public static void main(String[] args) {

        System.out.println("Enter the total numner of emails");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] emails = new String[n];
        for (int i = 0; i < n; i++) {
            emails[i] = sc.nextLine();
        }

        int validCount = 0;
        int invalidCount = 0;
        System.out.println("Email Validation Results:");
        for (int i = 0; i < n; i++) {

            String email = emails[i];
            boolean valid = true;

            if (email.startsWith(".") || email.endsWith(".") ||
                email.startsWith("@") || email.endsWith("@")) {
                valid = false;
            }

            int atIndex = email.indexOf('@');
            if (atIndex == -1) {
                valid = false;
            }
            if (email.indexOf('@') != email.lastIndexOf('@')) {
                valid = false;
            }
            int dotIndex = email.indexOf('.', atIndex);
            if (dotIndex == -1 || dotIndex == email.length() - 1) {
                valid = false;
            }
            if (valid) {
                validCount++;
                System.out.println((i + 1) + ". " + email + " - Valid");
            } else {
                invalidCount++;
                System.out.println((i + 1) + ". " + email + " - Invalid");
            }
        }
        System.out.println("Total Valid: " + validCount);
        System.out.println("Total Invalid: " + invalidCount);
        sc.close();
    }
}
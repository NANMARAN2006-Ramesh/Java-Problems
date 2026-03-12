import java.util.Scanner;

public class PasswordStrengthAnalyzer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Password Analysis:");

        for (int i = 0; i < n; i++) {

            String pass = sc.nextLine();

            boolean hasUpper = false;
            boolean hasLower = false;
            boolean hasDigit = false;
            boolean hasSpecial = false;

            for (int j = 0; j < pass.length(); j++) {

                char ch = pass.charAt(j);

                if (Character.isUpperCase(ch))
                    hasUpper = true;
                else if (Character.isLowerCase(ch))
                    hasLower = true;
                else if (Character.isDigit(ch))
                    hasDigit = true;
                else if ("!@$%^&".indexOf(ch) != -1)
                    hasSpecial = true;
            }

            if (pass.length() >= 8 && hasUpper && hasLower && hasDigit && hasSpecial) {
                System.out.println((i + 1) + ". " + pass + " - Strong");
            } else {

                String reason = "";

                if (pass.length() < 8)
                    reason += "Length < 8, ";
                if (!hasUpper)
                    reason += "Missing upper, ";
                if (!hasLower)
                    reason += "Missing lower, ";
                if (!hasDigit)
                    reason += "Missing digit, ";
                if (!hasSpecial)
                    reason += "Missing special, ";

                reason = reason.substring(0, reason.length() - 2);

                System.out.println((i + 1) + ". " + pass + " - Weak (" + reason + ")");
            }

            sc.close();
        }
    }
}
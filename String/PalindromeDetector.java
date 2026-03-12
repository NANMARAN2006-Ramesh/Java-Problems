import java.util.Scanner;

public class PalindromeDetector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("DNA Sequence Analysis:");
        for(int i = 1; i <= n; i++) {
            String seq = sc.nextLine();
            String s = seq.toLowerCase();
            int left = 0;
            int right = s.length() - 1;
            boolean palindrome = true;
            while(left < right) {
                if(s.charAt(left) != s.charAt(right)) {
                    palindrome = false;
                    break;
                }
                left++;
                right--;
            }
            if(palindrome) {
                System.out.println(i + ". " + seq + " - Palindrome");
            } else {
                System.out.println(i + ". " + seq + " - Not Palindrome");
            }
        }
        sc.close();
    }
}
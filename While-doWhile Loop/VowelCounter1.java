import java.util.Scanner;

public class VowelCounter1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        String input = str.toLowerCase();

        int vowelCount = 0;
        int i = 0;
        if (input.length() > 0) {
            do {
                char ch = input.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                }
                i++;
            } while (i < input.length());
        }

        System.out.println("Vowel Count: " + vowelCount);
        scanner.close();
    }
}

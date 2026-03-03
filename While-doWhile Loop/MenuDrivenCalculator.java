import java.util.Scanner;

public class MenuDrivenCalculator {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Calculator Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            choice = s1.nextInt();
            System.out.println("Choice: " + choice);
            if (choice == 5) {
                System.out.println("Goodbye!");
                break;
            }
            int num1 = s1.nextInt();
            int num2 = s1.nextInt();
            System.out.println("Enter two numbers: " + num1 + " " + num2);
            int value = 0;
            switch (choice) {
                case 1:
                    value = num1 + num2;
                    break;
                case 2:
                    value = num1 - num2;
                    break;
                case 3:
                    value = num1 * num2;
                    break;
                case 4:
                    value = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid choice");
                    continue;
            }

            System.out.println("Result: " + value);

        } while (choice != 5);

        s1.close();
    }
}
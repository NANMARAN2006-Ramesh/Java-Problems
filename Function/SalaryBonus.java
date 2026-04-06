import java.util.Scanner;

public class SalaryBonus {

    double calculateBonus(double salary) {
        if (salary > 50000) {
            return salary * 0.20;
        } else if (salary > 30000) {
            return salary * 0.10;
        } else {
            return salary * 0.05;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();

        SalaryBonus obj = new SalaryBonus();
        double bonus = obj.calculateBonus(salary);

        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);

        sc.close();
    }
}
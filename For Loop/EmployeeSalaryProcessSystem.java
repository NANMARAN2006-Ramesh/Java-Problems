import java.util.*;

public class EmployeeSalaryProcessSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of employee (1 to 100)");
        int numberOfEmployee = scan.nextInt();
        double totalPayRoll = 0;


        for (int i = 1; i <= numberOfEmployee; i++) {
            for (int j = i; j <= i; j++) {
                scan.nextLine();
                String name = scan.nextLine();
                double salary = scan.nextDouble();
                double performance = scan.nextDouble();

                System.out.println("Employee: " + name);
                System.out.println("Base Salary: $" + salary);
                System.out.println("Performanc Rating: " + performance);
                int increment = 0;
                double incrementSalary = 0;
                if (performance == 5) {
                    increment = 15;
                    incrementSalary = salary * (1 + increment / 100.0);
                } else if (performance == 4) {
                    increment = 10;
                    incrementSalary = salary * (1 + increment / 100.0);
                } else if (performance == 3) {
                    increment = 5;
                    incrementSalary = salary * (1 + increment / 100.0);
                } else if (performance == 2) {
                    increment = 2;
                    incrementSalary = (salary * increment) / 100.0;
                } else {
                    increment = 0;
                    incrementSalary = salary * (1 + increment / 100.0);
                }
                totalPayRoll = totalPayRoll + incrementSalary;
                System.out.println("Increment: " + increment + "%");
                System.out.printf("Final Salary: $%.1f" ,incrementSalary);
                System.out.println("\n");
            }
        }
        double avg = totalPayRoll / 5.0;
        System.out.println("Total Employee: " + numberOfEmployee);
        System.out.println("Total Payroll: $" + totalPayRoll);
        System.out.println("Average Salary: $"+avg);
        scan.close();
    }
}

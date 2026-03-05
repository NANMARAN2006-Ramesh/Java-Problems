import java.util.Scanner;

public class EmployeeSalaryAnalysis{
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the number of employees, 1 to 10000");
        int numberOfEmpoyee = s1.nextInt();

        double [] salary = new double[numberOfEmpoyee];

        double avg = 0.0;
        for(int i=0;i<numberOfEmpoyee;i++){
            salary[i] = s1.nextDouble();
            avg = avg+salary[i];
        }

        double avg1 = avg/numberOfEmpoyee;
        int count = 0;
        for(int i=0;i<numberOfEmpoyee;i++){
            if(salary[i]>avg1){
                count++;
            }
        }

        double percentage = ((double)count/numberOfEmpoyee)*100;

        System.out.println("Total Employees: "+numberOfEmpoyee);
        System.out.printf("Average Salary: %.2f\n",avg1);
        System.out.println("Employee Above Average: "+count);
        System.out.printf("Percentage: %.2f%%",percentage);

        s1.close();
    }
}
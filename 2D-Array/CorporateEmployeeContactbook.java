import java.util.Scanner;

public class CorporateEmployeeContactbook {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the departments count");
        int deps = s1.nextInt();
        int[][] employees = new int[deps][];

        int total = 0;
        for(int i = 0; i < deps; i++){
            int emps = s1.nextInt();
            employees[i] = new int[emps];
            for(int j = 0; j < emps; j++){
                employees[i][j] = s1.nextInt();
                total++;
            }
        }

        System.out.println("Employee Contact Book:");
        for(int i = 0; i < deps; i++){
            System.out.print("Dept " + (i+1) + ": ");
            for(int j = 0; j < employees[i].length; j++){
                System.out.print(employees[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Total Employees: " + total);
        s1.close();
    }
}
import java.util.Scanner;

public class DataUsage {

    String checkDataLimit(double used, double limit) {
        if (used > limit) {
            return "Limit Exceeded";
        } else {
            return "Safe";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter data used (in GB): ");
        double used = sc.nextDouble();

        System.out.print("Enter data limit (in GB): ");
        double limit = sc.nextDouble();

        DataUsage obj = new DataUsage();
        String result = obj.checkDataLimit(used, limit);

        System.out.println("Status: " + result);

        sc.close();
    }
} 


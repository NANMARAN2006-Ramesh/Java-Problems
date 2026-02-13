import java.util.*;
public class YoutubeMonthlyIncome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the AD Revenue:");
        int adRevenue = scan.nextInt();
        System.out.println("Enter the sponsership income:");
        int sponsership = scan.nextInt();
        System.out.println("Enter the affiliate income:");
        int affiliateInclome = scan.nextInt();
        System.out.println("Enter the tax:");
        int tax = scan.nextInt();
        System.out.println("Enter the production cost");
        int production = scan.nextInt();

        int revenue = adRevenue+sponsership+affiliateInclome-tax-production;
        System.out.println("Final Youtube Income = "+revenue);
    }
}

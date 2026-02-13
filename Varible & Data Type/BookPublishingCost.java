import java.util.*;
public class BookPublishingCost {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the total copies");
        int copies = scan.nextInt();
        System.out.println("Enter the cost per copies");
        int cost = scan.nextInt();
        System.out.println("Enter the editing charges");
        int editing = scan.nextInt();
        System.out.println("Enter the design charge");
        int design = scan.nextInt();
        System.out.println("Enter the distributor commission");
        int distributor = scan.nextInt();
        System.out.println("Enter the marketing expense cost");
        int marketing = scan.nextInt();

        int profit = (copies*cost)+editing+design-distributor-marketing;
        System.out.println("Publishing profit = "+profit);
    }
}

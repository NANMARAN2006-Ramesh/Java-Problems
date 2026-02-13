import java.util.*;;
public class CollegeEventFund {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the registration collection:");
        int regCollection = scan.nextInt();
        System.out.println("Enter the sponsership:");
        int sponsership = scan.nextInt();
        System.out.println("Enter the Stall rent:");
        int stallRent = scan.nextInt();
        System.out.println("Enter the Stage cost:");
        int stageCost = scan.nextInt();
        System.out.println("Enter the Celebrity Cost:");
        int celebrityCost = scan.nextInt();
        System.out.println("Enter the Marketing cost:");
        int marketing = scan.nextInt();

        int bill = regCollection+sponsership+stallRent-stageCost-celebrityCost-marketing;
        System.out.println("Remaining Fund = "+bill);
    }
}

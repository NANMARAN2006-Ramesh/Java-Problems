import java.util.*;
public class AgricultureFarmYield {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Yield Per Acres:");
        int yieldPerAcres = scan.nextInt();
        System.out.println("Enter the Acres:");
        int acres = scan.nextInt();
        System.out.println("Enter the Extra Yield:");
        int extra = scan.nextInt();
        System.out.println("Enter the damaged Crops:");
        int damaged = scan.nextInt();

        int bill = ((yieldPerAcres*acres)+extra)-damaged;

        System.out.println("Marketable Yield = "+bill);
    }
}

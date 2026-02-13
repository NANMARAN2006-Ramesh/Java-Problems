import java.util.*;
public class SportsTournmentPrize {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the team registration");;
        int registration = scan.nextInt();
        System.out.println("Enter the broadcasting rights");
        int broadcasting = scan.nextInt();
        System.out.println("Enter the sponsership");
        int sponsership = scan.nextInt();
        System.out.println("Enter the Prize money");
        int prize = scan.nextInt();
        System.out.println("Enter the stadium rent");
        int rent = scan.nextInt();
        System.out.println("Enter the advertising cost");
        int advertising = scan.nextInt();

        int remaining = registration+broadcasting+sponsership-prize-rent-advertising;
        System.out.println("Remainint Tournment Fund = "+remaining);

    }
}

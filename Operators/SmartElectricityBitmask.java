import java.util.Scanner;

public class SmartElectricityBitmask {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the connection Value");
        int connection = s.nextInt();
        System.out.println("Enter the appliance Mask");
        int appliance = s.nextInt();
        
        int value = connection&appliance;
        if(value!=0){
            System.out.println("Active");
        }
        else{
            System.out.println("Inactive");
        }
        s.close();
    }
}
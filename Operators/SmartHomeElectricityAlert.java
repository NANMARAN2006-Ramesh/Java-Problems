import java.util.Scanner;

public class SmartHomeElectricityAlert {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the units consumed");
        int units = s.nextInt();
        System.out.println("Enter the voltage fluction 1 or 0");
        int voltage = s.nextInt();

        if(units>500 || voltage!=0){
            System.out.println("Alert");
        }
        else{
            System.out.println("Normal");
        }
        s.close();
    }
}

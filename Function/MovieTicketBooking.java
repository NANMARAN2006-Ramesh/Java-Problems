import java.util.Scanner;

public class MovieTicketBooking {
    public static int price(int members){
        Scanner s2 = new Scanner(System.in);
        int total = 0;
        System.out.println("Enter the age: ");
        for(int i=0;i<members;i++){
            int price = 0;
            int age = s2.nextInt();

            if(age<12){
                price = 100;
            }
            else if(age>=12 && age<=60){
                price = 200;
            }
            else{
                price = 150;
            }
            total+=price;
        }
        s2.close();
        return total;  
    } 
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the how many members:");
        int members = s1.nextInt();
        int result = price(members);

        System.out.println("The total Amount of Your Ticket is: "+result);

        s1.close();
    }
}
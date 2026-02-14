import java.util.*;
public class MovieTheatreAgeAcess {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the age");
        int age = s.nextInt();
        System.out.println("Enter the id proof only 1 or 0");
        int id = s.nextInt();

        if(age>=18 && id==1){
            System.out.println("Allowed");
        }
        else{
            System.out.println("Denied");
        }
        s.close();
    }
}

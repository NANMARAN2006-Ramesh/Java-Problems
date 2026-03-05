import java.util.Scanner;

public class TimeTableScheduleMatrix {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the number of days, 1 to 6");
        int days = s1.nextInt();
        System.out.println("Enter the periods per day, 1 to 8");
        int periods = s1.nextInt();

        String [][] period = new String[days][periods];
        String [] names = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        for(int i=0;i<days;i++){
            for(int j=0;j<periods;j++){
                period [i][j] = s1.next();
            }
        }

        System.out.println("Class Time Table: ");
        System.out.print("Day ");
        for(int i=1;i<=periods;i++){
            System.out.print("Period"+i+" ");
        }
        System.out.println();
        System.out.println("Enter the period name");
        for(int i=0;i<days;i++){
            System.out.print(names[i]+" ");
            for(int j=0;j<periods;j++){
                System.out.print(period[i][j]+" ");
            }
            System.out.println();
        }
        s1.close();
    }
}

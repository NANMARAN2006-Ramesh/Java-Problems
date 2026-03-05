import java.util.Scanner;

public class CalendarMonthGridGenerator {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the days in month, 28 to 31");
        int days = s1.nextInt();
        System.out.println("Enter the start day");
        int startDay = s1.nextInt();

        System.out.println("Calendar Grid:");
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");

        int currentDate = 1;
        int totalCells = (startDay - 1) + days;

        for (int i = 1; i <= totalCells; i++) {
            if (i < startDay) {
                System.out.print("");
            } 
            else {
                System.out.print(currentDate + " ");
                currentDate++;
            }

            if (i % 7 == 0) {
                System.out.println();
            }
        }

        if (totalCells % 7 != 0) {
            System.out.println();
        }
        s1.close();
    }
}
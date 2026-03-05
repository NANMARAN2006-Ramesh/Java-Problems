import java.util.*;;
public class StudentGradePerformanceAnalyzer {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Engter the number of students");
        int numberOfStudent = s1.nextInt();

        int [] marks = new int[numberOfStudent];

        int max = 0;
        int min = -1;
        int failed = 0;
        for(int i=0;i<numberOfStudent;i++){
            marks[i] = s1.nextInt();

            if(marks[i]>max){
                max = marks[i];
            }
            if(marks[i]<min || min == -1){
                min = marks[i];
            }
            if(marks[i]<40){
                failed++;
            }
        }
        double failPercentage = (((double)numberOfStudent-(double)failed)/numberOfStudent)*100;

        System.out.println("Total Students: "+numberOfStudent);
        System.out.println("Heighest Score: "+max);
        System.out.println("Lowest Score: "+min);
        System.out.println("Failed Student: "+failed);
        System.out.printf("Failed Percentage: %.2f%%",failPercentage);

        s1.close();
    }
}

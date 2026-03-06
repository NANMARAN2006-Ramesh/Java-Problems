import java.util.Scanner;

public class HospitelPatientWaitTimeOptimizer {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        
        System.out.println("Enter the numberOfPatients, 1 to 1000");
        int numberOfPatients = s1.nextInt();

        int [] patient = new int[numberOfPatients];

        int max = 0;
        double total = 0;
        for(int i=0;i<numberOfPatients;i++){
            patient[i] = s1.nextInt();

            if(patient[i]>max){
                max = patient[i];
            }

            total = total+patient[i];
        }

        double avg = total/numberOfPatients;
        int count = 0;
        for(int i=0;i<numberOfPatients;i++){
            if(patient[i]>60){
                count++;
            }
        }

        double serviceLevel = ((numberOfPatients - count) * 100.0) / numberOfPatients;
        System.out.println("Total Patient: "+numberOfPatients);
        System.out.println("Longest Wait Time: "+max+ " minutes");
        System.out.printf("Average Wait Time: %.2f minutes\n",avg);
        System.out.println("Patient waiting >60 min: "+count);
        System.out.printf("Serivice Level: %.2f%%",serviceLevel);

        s1.close();
    }
}

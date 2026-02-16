import java.util.Scanner;

public class HospitalEmergencyTriage {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the heart rate");
        int heartRate = scan.nextInt();
        System.out.println("Enter the bloodPressure");
        scan.nextLine(); 
        String bloodPressure = scan.nextLine();
        System.out.println("Enter the temperature");
        double temperature = scan.nextDouble();
        System.out.println("Enter the symptomServerity");
        scan.nextLine();
        String symptomSeverity = scan.nextLine();

        String[] bpParts = bloodPressure.split("/");
        int systolic = Integer.parseInt(bpParts[0]);
        // int diastolic = Integer.parseInt(bpParts[1]);

        String priority;
        int waitTime;
        String action;
        if (heartRate < 50 || heartRate > 130 ||
            systolic > 180 || systolic < 90 ||
            temperature > 103 || temperature < 96 ||
            symptomSeverity.equals("Life-Threatening")) {

            priority = "Critical";
            waitTime = 0;
            action = "Immediate Emergency Care";
        }
        else if ((heartRate >= 50 && heartRate <= 60) ||
                 (heartRate >= 110 && heartRate <= 130) ||
                 (systolic >= 160 && systolic <= 180) ||
                 (systolic >= 90 && systolic <= 100) ||
                 (temperature >= 101 && temperature <= 103) ||
                 (temperature >= 96 && temperature <= 97) ||
                 symptomSeverity.equals("Severe")) {

            priority = "Urgent";
            waitTime = 20;
            action = "Priority Medical Attention";
        }
        else if (symptomSeverity.equals("Moderate")) {
            priority = "Standard";
            waitTime = 45;
            action = "Standard Examination";
        }
        else {
            priority = "Non-Urgent";
            waitTime = 90;
            action = "Routine Check-up";
        }
        System.out.println("Heart Rate: " + heartRate + " bpm");
        System.out.println("Blood Pressure: " + bloodPressure);
        System.out.println("Temperature: " + temperature + "°F");
        System.out.println("Symptom Severity: " + symptomSeverity);
        System.out.println("Triage Priority: " + priority);
        System.out.println("Estimated Wait Time: " + waitTime + " minutes");
        System.out.println("Recommended Action: " + action);

        scan.close();
    }
}

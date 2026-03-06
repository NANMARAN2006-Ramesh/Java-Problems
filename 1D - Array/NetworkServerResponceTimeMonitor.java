import java.util.Scanner;

public class NetworkServerResponceTimeMonitor {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the number of servers");
        int servers = s1.nextInt();

        int [] serverSpeed = new int[servers];
        int fast = -1;
        int slow = 0;
        double total = 0;
        int count = 0;
        for(int i=0;i<servers;i++){
            serverSpeed[i] = s1.nextInt();

            if(serverSpeed[i]<fast || fast == -1){
                fast = serverSpeed[i];
            }
            if(serverSpeed[i]>slow){
                slow = serverSpeed[i];
            }
            if(serverSpeed[i]>200){
                count++;
            }
            total = total+serverSpeed[i];
        }

        double avg = total/servers; 
        double performanceScore = ((servers-count)*100.0)/servers;

        System.out.println("Total Servers: "+servers);
        System.out.println("Fastest Response: "+fast+"ms");
        System.out.println("Slowest Response: "+slow+"ms");
        System.out.printf("Average Response: %.2fms\n",avg);
        System.out.printf("Performance Score: %.2f%%",performanceScore);
    }
}

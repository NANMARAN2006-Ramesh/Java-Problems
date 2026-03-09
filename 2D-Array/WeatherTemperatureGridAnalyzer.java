import java.util.Scanner;

public class WeatherTemperatureGridAnalyzer {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the rows and cols");
        int rows = s1.nextInt();
        int cols = s1.nextInt();

        int [][] temperature = new int[rows][cols];

        double total = 0;
        double max = 0;
        int maxIndexRow = -1;
        int maxIndexCol = -1;
        int minIndexRow = -1;
        int minIndexCol = -1;
        double min = -1;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                temperature[i][j] = s1.nextInt();

                total+=temperature[i][j];
                if(temperature[i][j]>max){
                    max = temperature[i][j];
                    maxIndexRow = i;
                    maxIndexCol = j;
                }
                if(temperature[i][j]<min || min==-1 ){
                    min = temperature[i][j];
                    minIndexRow = i;
                    minIndexCol = j;
                }
            }
        }
        System.out.println();
        System.out.println("Temperature Grid: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(temperature[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        int element = rows*cols;
        double avg = total/element;
        System.out.printf("Maximum Temperature: %.2f C at Position (%d, %d)\n",max,maxIndexRow,maxIndexCol);
        System.out.printf("Minimum Temperature: %.2f C at Position (%d, %d)\n",min,minIndexRow,minIndexCol);
        System.out.printf("Average Temperature: %.2f C",avg);

        s1.close();
    }
}

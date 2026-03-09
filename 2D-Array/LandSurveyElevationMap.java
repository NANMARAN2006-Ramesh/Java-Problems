import java.util.Scanner;

public class LandSurveyElevationMap {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the row and col");
        int row = s1.nextInt();
        int col = s1.nextInt();

        int [][] meters = new int[row][col];

        int max = 0;
        int min = -1;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                meters[i][j] = s1.nextInt();

                if(meters[i][j]>max){
                    max = meters[i][j];
                }
                if(meters[i][j]<min||min==-1){
                    min = meters[i][j];
                }
            }

            int elevaitonRange = max-min;
            System.out.println();
            System.out.println("Elevation Map:");
            for(int k=0;k<row;k++){
                for(int j=0;j<col;j++){
                    System.out.print(meters[k][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("Highest Point: "+max+" m");
            System.out.println("Lowest Point: "+min+" m");
            System.out.println("Elevation Range: "+elevaitonRange+" m");
        }
    }
}

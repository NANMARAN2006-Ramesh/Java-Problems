import java.util.*;

public class DigitalImageBrightnessAdjuster {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the height and width");
        int height = s1.nextInt();
        int width = s1.nextInt();
        System.out.println("Enter the brightness");
        int brightness = s1.nextInt();
        int [][]pixelValue = new int[height][width];
        int [][] adjustedBrightness = new int[height][width];

        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                pixelValue[i][j] = s1.nextInt();
            }
        }

        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                adjustedBrightness[i][j] = Math.min(255,Math.max(0,pixelValue[i][j]+brightness));
            }
        }

        System.out.println();
        System.out.println("Original Image:");
        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                System.out.print(pixelValue[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Adjusted Image:");
        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                System.out.print(adjustedBrightness[i][j]+" ");
            }
            System.out.println();
        }
        s1.close();
    }
}

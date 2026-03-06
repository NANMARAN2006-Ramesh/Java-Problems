import java.util.Scanner;

public class ManufacturingQualityControlDefect {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the number of production 1 to 100");
        int production = s1.nextInt();
        System.out.println("Enter the maxDefects");
        int maxDefects = s1.nextInt();

        int [] values = new int[production];
        int [] index = new int[production];
        int count = 0;
        for(int i=0;i<production;i++){
            values[i] = s1.nextInt();
            if(values[i]>maxDefects){
                index[count] = i+1;
                count++;
            }
        }

        double complianceRate= (((double)production-(double)count)/production)*100;
        System.out.println("Production Lines: "+production);
        System.out.println("Acceptable Threshold: "+maxDefects);
        System.out.println("Lines Exceeding Threshold: "+count);
        System.out.print("Critical Lines: [");
        for(int i=0;i<count;i++){

            System.out.print(index[i]+" ");
        }
        System.out.print("]\n");
        System.out.printf("Compliance Rate: %.2f%%",complianceRate);
        s1.close();
    }
}

import java.util.Scanner;

public class PatternPrinter {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the height 1 to 20");
        int height = s1.nextInt();
        System.out.println("Enter the character ");
        s1.nextLine();
        String character = s1.nextLine();

        for(int i=1;i<=height;i++){
            if(character.equals("star")){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
            }
            else if(character.equals("number")){
                for(int k=1;k<=i;k++){
                    System.out.print(k);
                }
            }
            System.out.println();
        }
        s1.close();
    }
}

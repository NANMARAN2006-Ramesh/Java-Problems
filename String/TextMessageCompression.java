import java.util.Scanner;

public class TextMessageCompression {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        String str = s1.nextLine();
        int n = str.length();

        String compressed = "";
        int count = 1;
        for(int i=0;i<n-1;i++){
            char ch = str.charAt(i);
            char ch1 = str.charAt(i+1);
            if(ch==ch1){
                count++;
            }
            else{
                compressed+=ch+""+count;
                count = 1;
            }
        }
        compressed+=str.charAt(n-1)+""+count;
        int originalLength = str.length();
        int compressedLength = compressed.length();

        double ratio = ((double)(originalLength - compressedLength) / originalLength) * 100;
        System.out.println();
        System.out.println("Original: " + str);
        System.out.println("Compressed: " + compressed);
        System.out.printf("Compression Ratio: %.2f%%", ratio);

        s1.close();
    }
}

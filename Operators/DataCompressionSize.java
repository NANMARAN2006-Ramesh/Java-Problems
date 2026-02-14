import java.util.*;
public class DataCompressionSize{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the file Size");
        int file = s.nextInt();
        System.out.println("Enter ther Compression cycles");
        int Compression = s.nextInt();

        int size = file>>Compression;
        System.out.println("The total size = "+size);
        s.close();
    }
}
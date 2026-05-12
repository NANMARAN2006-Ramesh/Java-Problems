import java.util.*;
import java.lang.*;
import java.io.*;

class DonationDrive
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for(int i=0;i<size;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a-b);
        }
        sc.close();
	}
}

import java.util.Scanner;

public class CryptocurrencyPortfolioValueTracker {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the number of diffrent cryptocurrencies, 1 to 100");
        int nOfCryptocurrencies = s1.nextInt();
        
        double [] quantity = new double[nOfCryptocurrencies];
        double [] price = new double[nOfCryptocurrencies];
        double [] result = new double[nOfCryptocurrencies];

        System.out.println("Enter the quantity");
        for(int i=0;i<nOfCryptocurrencies;i++){
            quantity[i] = s1.nextDouble();
        }
        System.out.println("Enter the price");
        for(int i=0;i<nOfCryptocurrencies;i++){
            price[i] = s1.nextDouble();
        }
        double total = 0;
        for(int j=0;j<nOfCryptocurrencies;j++){
            double mul = 1;
            mul = quantity[j]*price[j];
            result[j] = mul;
            total = total+mul;
        }

        double max = 0;
        int maxIndex = -1;
        double low = 0;
        int lowIndex = -1;
        for(int i=0;i<nOfCryptocurrencies;i++){
            if(result[i]>max){
                max = result[i];
                maxIndex = i+1;
            }
            if(result[i]<low || low == 0){
                low = result[i];
                lowIndex = i+1;
            }
        }
        System.out.println();
        System.out.println("Number of Asseste: "+nOfCryptocurrencies);
        System.out.printf("Total Portfolio Value: $%.2f\n",total);
        System.out.printf("Most Valuable Assest: Assest %d ($%.2f)\n",maxIndex,max);
        System.out.printf("Least Valuable Assest: Assest %d ($%.2f)\n",lowIndex,low);
    }
}

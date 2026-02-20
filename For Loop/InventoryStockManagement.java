import java.util.Scanner;

public class InventoryStockManagement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of product (1 to 100)");
        int number = scan.nextInt();
        int low = 0;
        int critical = 0;
        int totalQuantity = 0;
        for(int i=0;i<number;i++){
            System.out.println("Enter the product name");
            scan.nextLine();
            String product = scan.nextLine();
            System.out.println("Enter the current stock");
            int currentStock = scan.nextInt();
            System.out.println("Enter the minimumStock");
            int minimumStock = scan.nextInt();

            String status = "";
            if(currentStock>=minimumStock){
                status = "Adequate";
            }
            else if(currentStock<minimumStock){
                status = "Low Stock";
                low++;
            }
            else{
                status = "Critical";
                critical++;
            }

            double quantity = 0;
            if(status.equals("Adequate")){
                quantity = 0;
            }
            else if(status.equals("Low Stock")){
                quantity = (minimumStock-currentStock)+(minimumStock/2);
            }
            else{
                quantity = (minimumStock-currentStock)+(minimumStock*1.5);
            }
            totalQuantity+=quantity;
            System.out.println("Product: "+product);
            System.out.println("Current Stock: "+currentStock);
            System.out.println("Minimum Stock: "+minimumStock);
            System.out.println("Status: "+status);
            System.out.println("Recorder Quantity: "+quantity);
            System.out.println("\n");
        }
        System.out.println("Total Product: "+number);
        System.out.println("Low Stock Items: "+low);
        System.out.println("critical Items: "+critical);
        System.out.println("Total Recorder Quantity: "+totalQuantity);

        scan.close();
    }
}

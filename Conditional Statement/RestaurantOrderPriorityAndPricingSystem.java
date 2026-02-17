import java.util.Scanner;
public class RestaurantOrderPriorityAndPricingSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the orderType");
        String orderType = scan.nextLine();
        System.out.println("Enter the loyaltyStatus");
        String loyaltyStatus = scan.nextLine();
        System.out.println("Enter the orderValue");
        double orderValue = scan.nextDouble();
        System.out.println("Enter the timeSlot");
        scan.nextLine();
        String timeSlot = scan.nextLine();

        int baseDiscount = 0;
        if(loyaltyStatus.equals("Gold")){
            baseDiscount = 15;
        }
        else if(loyaltyStatus.equals("Silver")){
            baseDiscount = 10;
        }
        else if(loyaltyStatus.equals("Bronze")){
            baseDiscount = 5;
        }
        else if(loyaltyStatus.equals("None")){
            baseDiscount = 0;
        }

        int timeBasedAdujstment = 0;
        if(timeSlot.equals("Late-Night")){
            timeBasedAdujstment = -5;
        }
        else{
            timeBasedAdujstment = 0;
        }

        double serviceFees = 0.0;
        if(orderType.equals("Delivery")){
            serviceFees = (orderValue*10.00)/100;
        }
        else if(orderType.equals("Takeout")){
            serviceFees = (orderValue*3.0)/100;
        }
        else if(orderType.equals("Dine-In")){
            serviceFees = 0.0;
        }


        String kitchenPriority = "";
        if(timeSlot.equals("Peak")&& orderType.equals("Delivery")){
            kitchenPriority = "High";
        }
        else if(orderType.equals("Regular")){
            kitchenPriority = "Medium";
        }
        else if(orderType.equals("Late-Night")){
            kitchenPriority = "Low";
        }

        int preparation = 0;
        if(orderType.equals("Regular")&&kitchenPriority.equals("Medium")){
            preparation = 25;
        }
        else if(orderType.equals("Delivery")&& kitchenPriority.equals("High")){
            preparation = 30;
        }
        else if(orderType.equals("Takeout")&&kitchenPriority.equals("Low")){
            preparation = 15;
        }
        else if((orderType.equals("Dine-In"))&&(kitchenPriority.equals("Medium"))){
            preparation = 20;
        }

        double discountValue = orderValue*(1-baseDiscount/100.0);
        double finalAmount = discountValue+serviceFees;

        System.out.println("Order Type: "+orderType);
        System.out.println("Loyalty Status: "+loyaltyStatus);
        System.out.println("Order Value: $"+orderValue);
        System.out.println("Time Slot: "+timeSlot);
        System.out.println("Base Discount: "+baseDiscount+"%");
        System.out.println("Time-Based Adjustment: "+timeBasedAdujstment+"%");
        System.out.println("Service Fee: $"+serviceFees);
        System.out.println("Final Amount: $"+finalAmount);
        System.out.println("Kitchen Priority: "+kitchenPriority);
        System.out.println("Estimated Pre Time: "+preparation+" minutes");
        scan.close();
    }
}

import java.util.Scanner;

public class FoodDeliverFeeAndTimeEstimator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the distance");
        double distanceMiles = scan.nextDouble();
        System.out.println("Enter the order value");
        double orderValue = scan.nextDouble();
        System.out.println("Enter the time slot");
        scan.nextLine();
        String timeSlot = scan.nextLine();
        System.out.println("Enter the weather condition");
        String weatherCondition = scan.nextLine();

        double baseFee = 3.0;
        double distanceSurcharge = distanceMiles * 1.0;

        double peakTimeSurcharge = 0.0;
        if (timeSlot.equals("Breakfast")) {
            peakTimeSurcharge = 0.0;
        } else if (timeSlot.equals("Lunch")) {
            peakTimeSurcharge = 2.5;
        } else if (timeSlot.equals("Dinner")) {
            peakTimeSurcharge = 2.0;
        } else if (timeSlot.equals("Late-Night")) {
            peakTimeSurcharge = 1.5;
        }

        double weatherSurcharge = 0.0;
        if (weatherCondition.equals("Clear")) {
            weatherSurcharge = 0.0;
        } else if (weatherCondition.equals("Rain")) {
            weatherSurcharge = 2.0;
        } else if (weatherCondition.equals("Snow")) {
            weatherSurcharge = 3.0;
        } else if (weatherCondition.equals("Storm")) {
            weatherSurcharge = 5.0;
        }

        double discount = 0.0;
        if (orderValue >= 30 && orderValue < 50) {
            discount = 1.0;
        } else if (orderValue >= 50 && orderValue < 75) {
            discount = 3.0;
        } else if (orderValue >= 75) {
            discount = 5.0;
        }

        double finalFee = baseFee + distanceSurcharge + peakTimeSurcharge + weatherSurcharge - discount;
        if (finalFee < 2.99) {
            finalFee = 2.99;
        }

        int estimatedTime = (int)(distanceMiles * 8);

        if (timeSlot.equals("Lunch") || timeSlot.equals("Dinner")) {
            estimatedTime += 10;
        }

        if (weatherCondition.equals("Rain")) {
            estimatedTime += 5;
        } else if (weatherCondition.equals("Snow")) {
            estimatedTime += 10;
        } else if (weatherCondition.equals("Storm")) {
            estimatedTime += 15;
        }

        String priority;
        if (orderValue > 60) {
            priority = "Express";
        } else if (timeSlot.equals("Lunch") || timeSlot.equals("Dinner")) {
            priority = "High";
        } else {
            priority = "Standard";
        }

        System.out.println("Delivery Distance: " + distanceMiles + " miles");
        System.out.println("Order Value: $" + orderValue);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Weather Condition: " + weatherCondition);
        System.out.println("Base Delivery Fee: $" + baseFee);
        System.out.println("Distance Surcharge: $" + distanceSurcharge);
        System.out.println("Peak Time Surcharge: $" + peakTimeSurcharge);
        System.out.println("Weather Surcharge: $" + weatherSurcharge);
        System.out.println("Order Value Discount: $" + discount);
        System.out.println("Final Delivery Fee: $" + finalFee);
        System.out.println("Estimated Delivery Time: " + estimatedTime + " minutes");
        System.out.println("Service Priority: " + priority);


        scan.close();
    }
}
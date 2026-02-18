import java.util.Scanner;

public class ShippingCostAndDeliveryTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the packageWeight");
        double packageWeight = scan.nextDouble();
        System.out.println("Enter the destinationZone");
        scan.nextLine();
        String destinationZone = scan.nextLine();
        System.out.println("Enter the shippingSpeed");
        String shippingSpeed = scan.nextLine();
        System.out.println("Enter the packageSize");
        String packageSize = scan.nextLine();

        double baseRate = 0.0;
        if(shippingSpeed.equals("Economy")){
            baseRate = 5.0;
        }
        else if(shippingSpeed.equals("Standard")){
            baseRate = 10.0;
        }
        else if(shippingSpeed.equals("Express")){
            baseRate = 25.0;
        }
        else if(shippingSpeed.equals("Overnight")){
            baseRate = 50.0;
        }

        double weightSurcharge = packageWeight*2.0;

        double zoneMultiplier = 0.0;
        if(destinationZone.equals("Local")){
            zoneMultiplier = 1.0;
        }
        else if(destinationZone.equals("Regional")){
            zoneMultiplier = 1.2;
        }
        else if(destinationZone.equals("National")){
            zoneMultiplier = 1.5;
        }
        else if(destinationZone.equals("International")){
            zoneMultiplier = 3.0;
        }

        double sizeSurcharge = 0.0;
        if(packageSize.equals("Small")){
            sizeSurcharge = 0.0;
        }
        else if(packageSize.equals("Medium")){
            sizeSurcharge = 5.0;
        }
        else if(packageSize.equals("Large")){
            sizeSurcharge = 15.0;
        }
        else if(packageSize.equals("Oversized")){
            sizeSurcharge = 30.0;
        }

        double baseCost = (baseRate+weightSurcharge)*zoneMultiplier;
        double totalCost = baseCost+sizeSurcharge;
        int deliveryDays = 0;
        if (shippingSpeed.equalsIgnoreCase("Economy")) {
            if (destinationZone.equalsIgnoreCase("Local")) {
                deliveryDays = 7;
            } else if (destinationZone.equalsIgnoreCase("Regional")) {
                deliveryDays = 7;
            } else if (destinationZone.equalsIgnoreCase("National")) {
                deliveryDays = 7;
            } else if (destinationZone.equalsIgnoreCase("International")) {
                deliveryDays = 14;
            }
        } else if (shippingSpeed.equalsIgnoreCase("Standard")) {
            if (destinationZone.equalsIgnoreCase("Local")) {
                deliveryDays = 3;
            } else if (destinationZone.equalsIgnoreCase("Regional")) {
                deliveryDays = 5;
            } else if (destinationZone.equalsIgnoreCase("National")) {
                deliveryDays = 5;
            } else if (destinationZone.equalsIgnoreCase("International")) {
                deliveryDays = 10;
            }
        } else if (shippingSpeed.equalsIgnoreCase("Express")) {
            if (destinationZone.equalsIgnoreCase("Local")) {
                deliveryDays = 1;
            } else if (destinationZone.equalsIgnoreCase("Regional")) {
                deliveryDays = 2;
            } else if (destinationZone.equalsIgnoreCase("National")) {
                deliveryDays = 2;
            } else if (destinationZone.equalsIgnoreCase("International")) {
                deliveryDays = 3;
            }
        } else if (shippingSpeed.equalsIgnoreCase("Overnight")) {
            deliveryDays = 1;
        }

        String serviceLevel = "";
        if (shippingSpeed.equalsIgnoreCase("Economy")) {
            serviceLevel = "Budget";
        } else if (shippingSpeed.equalsIgnoreCase("Standard")) {
            serviceLevel = "Standard";
        } else if (shippingSpeed.equalsIgnoreCase("Express")) {
            serviceLevel = "Priority";
        } else if (shippingSpeed.equalsIgnoreCase("Overnight")) {
            serviceLevel = "Premium";
        }


        System.out.println("Package Weight: " + packageWeight + " lbs");
        System.out.println("Destination Zone: " + destinationZone);
        System.out.println("Shipping Speed: " + shippingSpeed);
        System.out.println("Package Size: " + packageSize);
        System.out.println("Base Shipping Rate: $" + baseRate);
        System.out.println("Weight Surcharge: $" + weightSurcharge);
        System.out.println("Zone Multiplier: " + zoneMultiplier + "x");
        System.out.println("Size Surcharge: $" + sizeSurcharge);
        System.out.println("Total Shipping Cost: $" + totalCost);
        System.out.println("Estimated Delivery: " + deliveryDays + " business days");
        System.out.println("Service Level: " + serviceLevel);

        scan.close();
    }
}

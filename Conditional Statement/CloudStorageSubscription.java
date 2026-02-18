import java.util.Scanner;

public class CloudStorageSubscription {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the storage capacity in gigabytes 10 to 10000");
        int storageCapacity = scan.nextInt();
        System.out.println("Enter the userCount");
        int userCount = scan.nextInt();
        System.out.println("Enter the backup Frequenct");
        scan.nextLine();
        String backupFrequency = scan.nextLine();
        System.out.println("Enter the supportTier");
        String supportTier = scan.nextLine();

        double storageBaseCost = 0.0;

        if (storageCapacity >= 10 && storageCapacity <= 100) {
            storageBaseCost = storageCapacity * 0.05;
        } else if (storageCapacity >= 101 && storageCapacity <= 500) {
            storageBaseCost = (100 * 0.05) + ((storageCapacity - 100) * 0.04);
        } else if (storageCapacity >= 501 && storageCapacity <= 2000) {
            storageBaseCost = (100 * 0.05) + (400 * 0.04) + ((storageCapacity - 500) * 0.03);
        } else if (storageCapacity > 2000) {
            storageBaseCost = (100 * 0.05) + (400 * 0.04) + (1500 * 0.03) + ((storageCapacity - 2000) * 0.02);
        }

        double perUserFee = 0.0;
        if (userCount >= 1 && userCount <= 10) {
            perUserFee = userCount * 5;
        } else if (userCount >= 11 && userCount <= 50) {
            perUserFee = userCount * 4;
        } else {
            perUserFee = userCount * 3;
        }

        double backupPremium = 0.0;
        if (backupFrequency.equals("Daily")) {
            backupPremium = 0.0;
        } else if (backupFrequency.equals("Hourly")) {
            backupPremium = 15 + (0.5 * userCount);
        } else if (backupFrequency.equals("Real-Time")) {
            backupPremium = 50 + (1 * userCount);
        }

        double supportFee = 0.0;
        if (supportTier.equals("Community")) {
            supportFee = 0.0;
        } else if (supportTier.equals("Standard")) {
            supportFee = 20.0;
        } else if (supportTier.equals("Priority")) {
            supportFee = 75.0;
        } else if (supportTier.equals("Enterprise")) {
            supportFee = 200.0;
        }

        double monthlyTotal = storageBaseCost + perUserFee + backupPremium + supportFee;
        double annualTotal = monthlyTotal * 12 * 0.9;

        String plan = "";
        String features = "";

        if (userCount == 1) {
            plan = "Personal";
            features = "Basic storage, file sync";
        } else if (userCount >= 2 && userCount <= 20) {
            plan = "Team";
            features = "Version history, file sharing, basic analytics";
        } else if (userCount >= 21 && userCount <= 100) {
            plan = "Business";
            features = "Advanced sharing, team analytics, priority support";
        } else {
            plan = "Enterprise";
            features = "Advanced security, compliance tools, dedicated support, API access";
        }

        System.out.println("Storage Capacity: " + storageCapacity + " GB");
        System.out.println("User Count: " + userCount);
        System.out.println("Backup Frequency: " + backupFrequency);
        System.out.println("Support Tier: " + supportTier);
        System.out.println("Base Storage Cost: $" + storageBaseCost);
        System.out.println("Per-User Fee: $" + perUserFee);
        System.out.println("Backup Premium: $" + backupPremium);
        System.out.println("Support Fee: $" + supportFee);
        System.out.println("Monthly Subscription: $" + monthlyTotal);
        System.out.println("Annual Subscription: $" + annualTotal + " (save 10%)");
        System.out.println("Recommended Plan: " + plan);
        System.out.println("Included Features: " + features);

        scan.close();
    }
}

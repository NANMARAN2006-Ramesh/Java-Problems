import java.util.Scanner;

public class InvestmentPortfolioRisk {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int stockPercentage = scan.nextInt();
        int investmentYears = scan.nextInt();
        scan.nextLine();
        String riskTolerance = scan.nextLine();
        String marketVolatility = scan.nextLine();

        int bondPercentage = 100 - stockPercentage;
        int riskScore = stockPercentage;

        if (investmentYears >= 1 && investmentYears <= 5) {
            if (stockPercentage > 50) {
                riskScore += 20;
            }
        } else if (investmentYears >= 6 && investmentYears <= 10) {
            if (stockPercentage > 60) {
                riskScore += 10;
            }
        } else if (investmentYears >= 11 && investmentYears <= 20) {
            if (stockPercentage > 80) {
                riskScore += 5;
            }
        }

        if (marketVolatility.equals("Medium")) {
            riskScore += 10;
        } else if (marketVolatility.equals("High")) {
            riskScore += 20;
        }

        if (riskScore > 100) {
            riskScore = 100;
        }

        String riskCategory;
        if (riskScore <= 30) {
            riskCategory = "Low";
        } else if (riskScore <= 60) {
            riskCategory = "Moderate";
        } else if (riskScore <= 80) {
            riskCategory = "High";
        } else {
            riskCategory = "Very High";
        }

        String alignmentStatus = "";
        String recommendation = "";
        String rebalancing = "";

        if (riskTolerance.equals("Conservative")) {
            if (riskCategory.equals("Low")) {
                alignmentStatus = "Well Aligned";
                recommendation = "Portfolio is appropriately balanced for your profile";
                rebalancing = "No action needed";
            } else if (riskCategory.equals("Moderate")) {
                alignmentStatus = "Acceptable";
                recommendation = "Risk slightly above conservative level";
                rebalancing = "Consider small reduction in stocks";
            } else {
                alignmentStatus = "Misaligned";
                recommendation = "Portfolio risk significantly exceeds tolerance level";
                rebalancing = "Reduce stocks to 30-40%, increase bonds and cash";
            }
        } else if (riskTolerance.equalsIgnoreCase("Moderate")) {
            if (riskCategory.equals("Moderate")) {
                alignmentStatus = "Well Aligned";
                recommendation = "Portfolio is appropriately balanced for your profile";
                rebalancing = "No action needed";
            } else if (riskCategory.equals("Low") || riskCategory.equals("High")) {
                alignmentStatus = "Acceptable";
                recommendation = "Portfolio risk slightly deviates from moderate level";
                rebalancing = "Minor rebalancing may improve alignment";
            } else {
                alignmentStatus = "Misaligned";
                recommendation = "Portfolio risk significantly exceeds tolerance level";
                rebalancing = "Reduce stock exposure to 50-70%";
            }
        } else if (riskTolerance.equalsIgnoreCase("Aggressive")) {
            if (riskCategory.equals("High") || riskCategory.equals("Very High")) {
                alignmentStatus = "Well Aligned";
                if (riskCategory.equals("Very High") && investmentYears >= 15) {
                    alignmentStatus = "Acceptable";
                    recommendation = "High risk level acceptable given long horizon and tolerance";
                    rebalancing = "Monitor closely, consider slight reduction if volatility persists";
                } else {
                    recommendation = "Portfolio is appropriately balanced for your profile";
                    rebalancing = "No action needed";
                }
            } else if (riskCategory.equals("Moderate")) {
                alignmentStatus = "Acceptable";
                recommendation = "Portfolio slightly conservative for aggressive growth";
                rebalancing = "Consider increasing stock allocation";
            } else {
                alignmentStatus = "Misaligned";
                recommendation = "Portfolio is too conservative for your risk tolerance";
                rebalancing = "Increase stocks to 80-90% for better growth potential";
            }
        }

        System.out.println("Stock Allocation: " + stockPercentage + "%");
        System.out.println("Bond Allocation: " + bondPercentage + "%");
        System.out.println("Investment Horizon: " + investmentYears + " years");
        System.out.println("Risk Tolerance: " + riskTolerance);
        System.out.println("Market Volatility: " + marketVolatility);
        System.out.println("Portfolio Risk Score: " + riskScore + "/100");
        System.out.println("Risk Category: " + riskCategory);
        System.out.println("Alignment Status: " + alignmentStatus);
        System.out.println("Recommendation: " + recommendation);
        System.out.println("Suggested Rebalancing: " + rebalancing);

        scan.close();
    }
}

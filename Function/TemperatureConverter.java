import java.util.Scanner;

public class TemperatureConverter {
    double convertTemp(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        TemperatureConverter obj = new TemperatureConverter();
        double fahrenheit = obj.convertTemp(celsius);

        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);

        sc.close();
    }
}
import java.util.Scanner;

public class task4 {
    private static final double USD_TO_EUR = 0.85;
    private static final double EUR_TO_USD = 1.18;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Currency Converter!");
        System.out.println("1. USD to EUR");
        System.out.println("2. EUR to USD");
        System.out.print("Choose conversion type: ");
        int choice = scanner.nextInt();

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        double convertedAmount = 0;
        switch (choice) {
            case 1:
                convertedAmount = convertUsdToEur(amount);
                System.out.println("Converted amount: EUR " + convertedAmount);
                break;
            case 2:
                convertedAmount = convertEurToUsd(amount);
                System.out.println("Converted amount: USD " + convertedAmount);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }

    private static double convertUsdToEur(double amount) {
        return amount * USD_TO_EUR;
    }

    private static double convertEurToUsd(double amount) {
        return amount * EUR_TO_USD;
}
}

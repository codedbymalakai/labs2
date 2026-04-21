import java.util.Scanner;

public class AirportKiosk {
public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double amountToExchange;
    String currency;
    String type;
    double finalAmount;
    finalAmount = 0;

    System.out.println("How much in GBP do you want to exchange?");
    amountToExchange = keyboard.nextDouble();
    keyboard.nextLine();

    System.out.println("Which currency do you want to convert to? (USD, EUR, JPY).");
    currency = keyboard.nextLine();

    System.out.println("What is the customer type?");
    type = keyboard.nextLine();

    if (currency.equals("USD")) {
        finalAmount = amountToExchange * 1.25;
    } else if (currency.equals("EUR")) {
        finalAmount = amountToExchange * 1.15;
    } else if (currency.equals("JPY")) {
        finalAmount = amountToExchange * 180.50;
    }

    System.out.println(finalAmount);


}
}

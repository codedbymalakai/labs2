package lab3;

import java.util.Scanner;

public class Program {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int num = getInt("Enter an integer: ");
        String text = getString("Enter a string: ");

        System.out.println("You entered int: " + num);
        System.out.println("You entered string: " + text);

        theLunchQueue();
    }

    public static int getInt(String prompt) {
        System.out.println(prompt);
        return s.nextInt();
    }

    public static String getString(String prompt) {
        System.out.println(prompt);
        s.nextLine(); // consume leftover newline if needed
        return s.nextLine();
    }

    public static void theLunchQueue() {

    String mainCourse = getString("What main dish would you like (Fish, Burgers or veg)? ");
    int potatoes = getInt("How many roast potatoes would you like? ");
    int sprouts = getInt("How many Brussel Sprouts would you like? ");

    System.out.println("Hello, your lunch is " + mainCourse +
            " with " + potatoes +
            " roast potatoes and " + sprouts +
            " Brussel sprouts.");
}
}
import java.util.Scanner;

public class Proj2_1_AverageOfThree {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
        double first;
        double second;
        double third;

        System.out.println("What is your first number?");
        first = keyboard.nextDouble();

        System.out.println("What is your second number?");
        second = keyboard.nextDouble();

        System.out.println("What is your third number?");
        third = keyboard.nextDouble();

        System.out.println("Your average is: " + (first + second + third) / 3 + "!");
    }
}

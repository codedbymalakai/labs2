import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        String city;
        int age;
        double dubInput;

        System.out.println("What is your name?");
        name = keyboard.nextLine();

        System.out.println("What's your age?");
        age = keyboard.nextInt();
        keyboard.nextLine(); // consume the newline

        System.out.println("What city do you live in?");
        city = keyboard.nextLine();

        System.out.println("Give us a real number:");
        dubInput = keyboard.nextDouble();
        keyboard.nextLine(); // consume the newline

        System.out.println("Your real number multiplied by two is " + (dubInput * 2));

        System.out.println("Hello " + name + ", age " + age + ", from " + city);
    }
}
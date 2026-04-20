import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int integer;

        System.out.println("Give us an integer");
        integer = keyboard.nextInt();

        if (integer % 3 == 0) {
            System.out.println("This number is divisible by 3");
        } else {
            System.out.println("This number is not divisible by 3");
        }
    }
}

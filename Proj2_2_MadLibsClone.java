import java.util.Scanner;

public class Proj2_2_MadLibsClone {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String ADJECTIVE1;
        String GIRLS_NAME;
        String ADJECTIVE2;
        String OCCUPATION1;
        String PLACE;
        String CLOTHING;
        String HOBBY;
        String ADJECTIVE3;
        String OCCUPATION2;
        String BOYS_NAME;
        String MANS_NAME;

        System.out.println("Enter an adjective: ");
        ADJECTIVE1 = keyboard.nextLine();

        System.out.println("Enter a girls name: ");
        GIRLS_NAME = keyboard.nextLine();

        System.out.println("Enter another adjective: ");
        ADJECTIVE2 = keyboard.nextLine();

        System.out.println("Enter an occupation: ");
        OCCUPATION1 = keyboard.nextLine();

        System.out.println("Enter the name of a place: ");
        PLACE = keyboard.nextLine();

        System.out.println("Enter the name of a piece of clothing: ");
        CLOTHING = keyboard.nextLine();

        System.out.println("Enter the name of a hobby: ");
        HOBBY = keyboard.nextLine();

        System.out.println("Enter another adjective: ");
        ADJECTIVE3 = keyboard.nextLine();

        System.out.println("Enter another occupation: ");
        OCCUPATION2 = keyboard.nextLine();

        System.out.println("Enter a boy's name: ");
        BOYS_NAME = keyboard.nextLine();

        System.out.println("Enter a man's name: ");
        MANS_NAME = keyboard.nextLine();



        System.out.println("There once was a " + ADJECTIVE1 + " girl named " + GIRLS_NAME + ", who was a " + ADJECTIVE2 + " " + OCCUPATION1 + " in the Kingdom of " + PLACE + ". She loved to wear " + CLOTHING + " and to " + HOBBY + ". She wanted to marry the " + ADJECTIVE3 + " " + OCCUPATION2 + " named " + BOYS_NAME + " but her father, King " + MANS_NAME + " forbid her from seeing him.");
    }
}

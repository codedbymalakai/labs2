import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
public static void main(String[] args) {
    Random random = new Random();
    int myRandomNumber;
    Scanner keyboard = new Scanner(System.in);
    int guess;
    int guesses;
    boolean correct;

    myRandomNumber = random.nextInt(100) + 1;
    guesses = 0;
    correct = false;
    System.out.println("number is: " + myRandomNumber);

    

    while (!correct) {
        System.out.println("Guess a number");
        guess = keyboard.nextInt();
        guesses++;
        if (guess == myRandomNumber) {
            correct = true;
            System.out.println("Congratulations! You guessed the number in " + guesses + " guesses! Thanks for playing!");
        } else if (guess < 1 || guess > 100) {
            System.out.println("That was a wasted guess! Pick a number between 1 and 100, inclusive!");
        } else if (guess < myRandomNumber) {
            System.out.println("Your guess was too low");
        } else if (guess > myRandomNumber) {
            System.out.println("Your guess was too high");
        } 
    }
}
}

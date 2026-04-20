import java.util.Random;

public class DiceSimulation {
    public static void main(String[] args) {
        Random random = new Random();
        int myRandomNumber;
        int count = 1;

        while (count < 11) {
            myRandomNumber = random.nextInt(6) + 1;
            System.out.println("Dice roll number " + count + " is: "  + myRandomNumber);
            count++;
        }
    }
}

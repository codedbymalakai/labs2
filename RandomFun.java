import java.util.Random;

public class RandomFun {
    public static void main(String[] args) {
        Random random = new Random();
        int myRandomNumber;

        myRandomNumber = random.nextInt();
        System.out.println("number is: " + myRandomNumber);

        myRandomNumber = random.nextInt(10) + 1;
        System.out.println("number is: " + myRandomNumber);
    }
}

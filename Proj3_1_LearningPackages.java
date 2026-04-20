import java.util.Scanner;

public class Proj3_1_LearningPackages {

    public static int getPrice(int userPackage, int course) {
    if (userPackage == 1 && course > 2) {
        return (course - 2) * 6;
    } else if (userPackage == 2 && course > 4) {
        return (course - 4) * 4;
    } else if (userPackage == 3 && course > 6) {
        return (course - 6) * 3;
    } else {
        return 0;
    }
}
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int userPackage;
        int courses;
        int price;

        System.out.println("Which of the packages do you want? 1,2, or 3?");
        userPackage = keyboard.nextInt();
        if (userPackage == 1) {
            price = 10;
        } else if (userPackage == 2) {
            price = 12;
        } else if (userPackage == 3) {
            price = 15;
        } else {
            price = 0;
            System.out.println("Invalid choice");
            return;
        }
        System.out.println("How many courses did you enroll in this month?");
        courses = keyboard.nextInt();
        price = price + getPrice(userPackage, courses);

        System.out.println("Total cost is $" + price);
    }
}


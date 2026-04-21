package lab4;

import java.util.Arrays;

public class Program {

public static void MultiplicationTable() {

    for (int i = 1; i < 11; i++) {

        for (int v = 1; v < 11; v++) {
            System.out.print(i * v);
        }

        System.out.println();
    }
}

public static int howLong() {

    double initialMoney = 100;
    double currentMoney = initialMoney;
    double interestRate = 0.05;
    int years = 0;

    while (currentMoney < 200) {
        currentMoney = currentMoney * (1 + interestRate);
        years++;
    }

    return years;
}

public static String getGrade(int mark) {

    if (mark < 1 || mark > 100) {
        return "Not a valid grade";
    } else if (mark < 50) {
        return "Fail";
    } else if (mark <= 60) {
        return "Pass";
    } else if (mark <= 70) {
        return "Merit";
    } else {
        return "Distinction";
    }
}
public static void main(String[] args) {

    int[] numbers = { 1, 3, -5, 7, 0, 4, 6, 8 };
    String[] students = { "Harry", "Alice", "Steven", "Henry", "Peter"};
    int[] marks = { 67, 80, 11, 57, 12};
    System.out.println(Arrays.toString(numbers));

    double sum = 0;
    double min = numbers[0];
    double max = numbers[0];

    for (int i = 0; i < numbers.length; i++) {
        sum += numbers[i];

        if (numbers[i] < min) {
            min = numbers[i];
        }
        if (numbers[i] > min) {
            min = numbers[i];
        }
        if (numbers[i] == 0) {
            System.out.println(numbers[i] + " is the index of 0");
        }

    }
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + sum / numbers.length);

    System.out.println("Min: " + min);
    System.out.println("Max: " + max);

    for (int i = 0; i < marks.length; i++) {
        System.out.println(students[i] + ": " + getGrade(marks[i]));
    }

    int result = howLong();
    System.out.println("Years: " + result);

    MultiplicationTable();
}
}

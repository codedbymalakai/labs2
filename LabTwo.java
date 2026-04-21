public class LabTwo {
public static void main(String[] args) {
    int mark;
    mark = 80;

    if (mark < 1 || mark > 100) {
        System.out.println("Not a valid grade");
    } else if (mark < 50) {
        System.out.println("Fail");
    } else if (mark >= 50 && mark <= 60) {
        System.out.println("Pass");
    } else if (mark >= 61 && mark <= 70) {
        System.out.println("Merit");
    } else if (mark >= 71 && mark <= 100) {
        System.out.println("Distinction");
    }
}
}

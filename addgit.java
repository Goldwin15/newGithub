import java.util.Scanner;

public class addgit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        // nextDouble() reads the next double from the keyboard
        double first = input.nextDouble();
        double second = input.nextDouble();
        System.out.println("addition of two numbers: " + (first + second));
        input.close();
    }
}

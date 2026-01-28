import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            int a = input.nextInt();
            int b = input.nextInt();
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers");
        } finally {
            System.out.println("This Program is Completed");
        }
    }
}

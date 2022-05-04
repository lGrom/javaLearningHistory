package conditionals.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main.divide();
    }

    public static void divide(){
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextInt();

            float z = x / y;

            System.out.printf("result: %s\n", z);
        } catch(ArithmeticException e) {
            System.out.println("Divide by zero error");
            Main.divide();
        } catch(InputMismatchException e) {
            System.out.println("That's not a whole number");
            Main.divide();
        } catch (Exception e) {
            System.out.println("I have no idea what you did but it kinda made me explode so gj ig");
            Main.divide();
        }
    }
}

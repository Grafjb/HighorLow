import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        int guess=0;
        boolean validInput = false;

        do {
            System.out.print("Guess the number (1 to 10): ");
            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next(); // Clear invalid input
            }
        } while (!validInput);

        if (guess == randomNumber) {
            System.out.println("Congratulations! You guessed the number correctly!");
        } else if (guess < randomNumber) {
            System.out.println("Too low! The correct number was: " + randomNumber);
        } else {
            System.out.println("Too high! The correct number was: " + randomNumber);
        }

        scanner.close();
    }
}

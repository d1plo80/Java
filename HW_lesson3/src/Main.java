import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int newGame;

        do {
            int randomNumber = random.nextInt(10);
            int userNumber;
            System.out.println("Please enter a number from 0 to 9...");
            for (int i = 0; i < 3; i++) {
                userNumber = scanner.nextInt();
                    while (userNumber < 0 || userNumber > 9) {
                        System.out.println("Enter the correct number from 0 to 9...");
                        userNumber = scanner.nextInt();
                    }
                if (userNumber > randomNumber) {
                    System.out.println("Your number is greater than random number");
                } else if (userNumber < randomNumber) {
                    System.out.println("Your number is less than random number");
                } else {
                    System.out.println("You are the winner!");
                    break;
                }
            }
            System.out.println("Random number " + randomNumber);
            System.out.println("Press 1 to play again or 0 to end the game");
            newGame = scanner.nextInt();
            while (newGame < 0 || newGame > 1) {
                System.out.println("Please, choose 0 or 1 ...");
                newGame = scanner.nextInt();
            }
        } while (newGame == 1);

    }
}

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int answer, guess;
        final int MAX = 100;

        Random rand = new Random();
        boolean correct = false;

        answer = rand.nextInt(MAX) + 1;

        while (!correct) {

            System.out.println("Guess a number between 1 and 100: ");
            guess = read.nextInt();

            if (guess > answer) {
                System.out.println("Lower");
            }else if (guess < answer) {
                System.out.println("Higher");
            }else {
                System.out.println("Yes, you guessed the number.");
                correct = true;
            }
        }
        System.exit(0);

    }
}
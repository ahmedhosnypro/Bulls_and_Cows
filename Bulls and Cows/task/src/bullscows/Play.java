package bullscows;

import java.util.Scanner;

import static bullscows.Grader.grader;
import static bullscows.SecretNumberGenerator.generateSecretNumber;

public class Play {
    static void play(){
        System.out.println("Please, enter the secret code's length:");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        if (length > 10){
            System.out.println("Error: can't generate a secret number with a length of " +
                    length + " because there aren't enough unique digits.");
        }
        else {
            int secret = generateSecretNumber(length);
            System.out.println("Okay, let's start a game!");
            int turn = 1;
            while (true){
                System.out.println("Turn " + turn +":");
                String attempt = scanner.next();
                if (!grader(secret, attempt))
                    break;
            }
        }

    }
}

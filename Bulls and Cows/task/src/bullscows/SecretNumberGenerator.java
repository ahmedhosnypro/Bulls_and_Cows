package bullscows;

import java.util.Random;

public class SecretNumberGenerator {
    static void generateSecretNumber(int length){
        StringBuilder secretNumber = new StringBuilder("");
        if (length > 10){
            System.out.println("Error: can't generate a secret number with a length of " +
                    length + " because there aren't enough unique digits.");
        }
        else {
            while (secretNumber.length() < length){
                long pseudoRandomNumber = System.nanoTime();
                Random random = new Random(pseudoRandomNumber);
                int randomNumber = random.nextInt(10);
                if (randomNumber == 0 && secretNumber.length() == 0){
                    continue;
                }
                else if (secretNumber.indexOf(String.valueOf(randomNumber)) == -1){
                    secretNumber.append(randomNumber);
                }
            }

        }
        System.out.println("The random secret number is " + secretNumber);
    }

}

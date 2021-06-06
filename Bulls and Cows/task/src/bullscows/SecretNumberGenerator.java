package bullscows;

import java.util.Random;

public class SecretNumberGenerator {
    static int generateSecretNumber(int length) {
        StringBuilder secretNumber = new StringBuilder("");
        while (secretNumber.length() < length) {
            long pseudoRandomNumber = System.nanoTime();
            Random random = new Random(pseudoRandomNumber);
            int randomNumber = random.nextInt(10);
            if (randomNumber == 0 && secretNumber.length() == 0) {
                continue;
            } else if (secretNumber.indexOf(String.valueOf(randomNumber)) == -1) {
                secretNumber.append(randomNumber);
            }
        }
        return Integer.parseInt(secretNumber.toString());
    }

}

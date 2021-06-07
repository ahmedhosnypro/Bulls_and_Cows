package bullscows;

import java.util.Random;

public class RandomCodeGenerator {
    static String generateSecretNumber(int length, int symbolRange) {
        StringBuilder secretCode = new StringBuilder("");
        while (secretCode.length() < length) {
            long pseudoRandomNumber = System.nanoTime();
            Random random = new Random(pseudoRandomNumber);
            int randomSymbolRange = random.nextInt(symbolRange);
            char randChar = (char) (randomSymbolRange < 10 ? randomSymbolRange + 48 : randomSymbolRange + 87);
            if (secretCode.indexOf(String.valueOf(randChar)) == -1) {
                secretCode.append(randChar);
            }
        }
        return secretCode.toString();
    }
}

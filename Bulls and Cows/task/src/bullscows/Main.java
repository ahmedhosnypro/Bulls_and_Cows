package bullscows;

import java.util.Scanner;

import static bullscows.SecretNumberGenerator.generateSecretNumber;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            int length = scanner.nextInt();
            generateSecretNumber(length);
        }
    }
}


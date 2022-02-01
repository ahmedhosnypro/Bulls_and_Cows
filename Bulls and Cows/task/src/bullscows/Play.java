package bullscows;

import java.util.Scanner;

import static bullscows.Grader.grader;
import static bullscows.RandomCodeGenerator.generateSecretNumber;

public class Play {
    static void play() {
        Scanner scanner = new Scanner(System.in);
        int length = length();
        if (length != -1) {
            int range = range(length);
            if (range != -1) {
                System.out.println(preparedSecret(length, range));
                String secret = generateSecretNumber(length, range);
                int turn = 1;
                String attempt = "";
                do {
                    System.out.println("Turn " + turn + ":");
                    attempt = attempt(length, range);
                    if (attempt.equals("Error")) {
                        System.out.println("Error");
                        break;
                    } else
                        turn++;
                } while (grader(secret, attempt));
            }
        }
    }

    private static String preparedSecret(int length, int range) {
        range--;
        StringBuilder sb = new StringBuilder("");
        sb.append("The secret is prepared: ");
        sb.append("*".repeat(Math.max(0, length)));
        sb.append(" ");
        if (range < 10) {
            char ch = (char) (range + 48);
            sb.append("(").append(0).append("-").append(ch).append(").");
        } else {
            char ch = (char) (range + 87);
            sb.append("(").append(0).append("-").append(9).append(", ").append("a-").append(ch).append(").");
        }
        return sb.toString();
    }

    private static int length() {
        System.out.println("Please, enter the secret code's length:");
        Scanner scanner = new Scanner(System.in);
        int length = -1;
        String input = scanner.nextLine().trim();
        try {
            length = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + "\"" + input + "\"" + "isn't a valid number.");
        }
        if (length == 0) {
            System.out.println("Error: invalid length");
            length = -1;
        }
        if (length > 36) {
            System.out.println("Error: can't generate a secret code with a length of" +
                    length + " because there aren't enough unique characters.");
            length = -1;
        }

        return length;
    }

    private static int range(int length) {
        int range = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of possible symbols in the code:");
        String input = scanner.nextLine().trim();
        try {
            range = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + "\"" + range + "\"" + "isn't a valid number.");
        }
        if (range > 36) {
            System.out.println("Error: maximum number of possible symbols in the code is 36 (0-9, a-z).");
            range = -1;
        } else if (range < length) {
            System.out.println("Error: it's not possible to generate a code with a length of " +
                    length + " with " + range + " unique symbols.");
            range = -1;
        }
        return range;
    }

    private static String attempt(int length, int range) {
        String attempt;
        Scanner scanner = new Scanner(System.in);
        attempt = scanner.nextLine();
        if (attempt.length() != length) {
            attempt = "Error";
        } else if (range <= 10) {
            if (attempt.contains("^\\d")) {
                attempt = "Error";
            }
        } else {
            if (attempt.contains("^\\d|[a-z]")) {
                attempt = "Error";
            }
        }
        return attempt;
    }
}
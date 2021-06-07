package bullscows;

import java.util.Scanner;

import static bullscows.Grader.grader;
import static bullscows.RandomCodeGenerator.generateSecretNumber;

public class Play {
    static void play(){
        System.out.println("Please, enter the secret code's length:");
        Scanner scanner = new Scanner(System.in);
        int length = 0;
        try {
            length = Integer.parseInt(scanner.nextLine().trim());
        }
        catch (NumberFormatException e){
            System.out.println("enter a number");
        }

        if (length > 36){
            System.out.println("Error: can't generate a secret number with a length of " +
                    length + " because there aren't enough unique digits.");
        }
        else {
            System.out.println("Input the number of possible symbols in the code:");
            int symbolRange = 0;
            try {
                symbolRange = Integer.parseInt(scanner.nextLine());
            }
            catch (NumberFormatException e){
                System.out.println("enter a number");
            }
            String secret = generateSecretNumber(length, symbolRange);
            System.out.println(preparedSecret(length, symbolRange));
            int turn = 1;
            String attempt = "";
            do {
                System.out.println("Turn " + turn +":");
                attempt = scanner.nextLine();
                turn++;
            }while (grader(secret, attempt));
        }

    }
    private static String preparedSecret(int length, int symbolRange){
        symbolRange--;
        StringBuilder sb = new StringBuilder("");
        sb.append("The secret is prepared: ");
        sb.append("*".repeat(Math.max(0, length)));
        sb.append(" ");
        if (symbolRange < 10){
            char ch = (char) (symbolRange + 48);
            sb.append("(").append(0).append("-").append(ch).append(").");
        }
        else {
            char ch = (char) (symbolRange + 87);
            sb.append("(").append(0).append("-").append(9).append(", ").append("a-").append(ch).append(").");
        }
        return sb.toString();
    }
}

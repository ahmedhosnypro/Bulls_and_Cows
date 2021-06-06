package bullscows;

import java.util.Scanner;

import static bullscows.Grader.grader;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempt = scanner.nextInt();
        int secret = 9305;
        grader(secret, attempt);
    }
}


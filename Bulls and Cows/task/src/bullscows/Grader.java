package bullscows;

public class Grader {
    static void grader(int secret, int attempt) {
        String secretDigits = String.valueOf(secret);
        String attemptDigits = String.valueOf(attempt);
        int bulls = 0;
        int cows = 0;
        for (int i = 0; i < secretDigits.length(); i++){
            if (secretDigits.charAt(i) == attemptDigits.charAt(i)){
                bulls++;
            }
            else if (secretDigits.contains(String.valueOf(attemptDigits.charAt(i)))){
                cows++;
            }
        }
        System.out.println("Grade: " +
                (bulls > 0 && cows > 0 ? bulls + " bull(s) and " + cows + " cow(s)"
                        : bulls > 0 && cows == 0 ? bulls + " bull(s)" :
                        cows > 0 && bulls == 0 ? cows + " cow(s)" : "None") +
                ". The secret code is " +
                secret
                );
    }
}

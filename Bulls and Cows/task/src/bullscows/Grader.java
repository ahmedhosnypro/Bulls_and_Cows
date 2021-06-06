package bullscows;

import java.util.Arrays;

public class Grader {
    static void grader(int secret, int attempt) {

        int[] secretDigits = new int[4];
        int[] attemptDigits = new int[4];
        int index = 0;
        int secretCopy =secret;
        while (index < 4){
            int s = secretCopy % 10;
            int a = attempt % 10;
            secretDigits[index] = s;
            attemptDigits[index] = a;
            index++;
            secretCopy /= 10;
            attempt /= 10;
        }
        int bulls = 0;
        int cows = 0;
        if (Arrays.equals(secretDigits, attemptDigits)){
            bulls = 4;
        }
        else {
            for (int i = 0; i < secretDigits.length; i++){
                for (int j = 0; j < attemptDigits.length; j++){
                    if (i == j){
                        if (attemptDigits[i] == (secretDigits[i]))
                            bulls++;
                    }
                    else {
                        if (attemptDigits[j] == (secretDigits[i]))
                            cows++;
                    }

                }
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

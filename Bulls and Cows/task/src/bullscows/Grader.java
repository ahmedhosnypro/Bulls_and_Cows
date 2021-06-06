package bullscows;

public class Grader {
    static boolean grader(int secret, String attempt) {
        boolean isNotFinished = true;
        String secretDigits = String.valueOf(secret);
        int bulls = 0;
        int cows = 0;
        for (int i = 0; i < secretDigits.length(); i++){
            if (secretDigits.charAt(i) == attempt.charAt(i)){
                bulls++;
            }
            else if (secretDigits.contains(String.valueOf(attempt.charAt(i)))){
                cows++;
            }
        }
        StringBuilder printer = new StringBuilder("Grade: ");
        if (bulls > 0 && cows > 0){
            if (bulls == 1 & cows == 1)
                printer.append(bulls).append(" bull and ").append(cows).append(" cow");
            else
                printer.append(bulls).append(" bulls and ").append(cows).append(" cows");
        }
        else if (bulls > 0 && cows == 0){
            if (bulls == secretDigits.length() && secretDigits.length() > 1) {
                printer.append(bulls).append(" bulls\n").append("Congratulations! You guessed the secret code.");
                isNotFinished = false;
            }
            else if (bulls == 1)
                printer.append(bulls).append(" bull");
            else if (bulls < secretDigits.length())
                printer.append(bulls).append(" bulls");
        }
        else if (cows > 0 && bulls == 0){
            if (cows == 1)
                printer.append(cows).append(" cow");
            else
                printer.append(cows).append(" cows");
        }
        else if (bulls == 0 && cows ==0){
            printer.append("None");
        }
        System.out.println(printer);
        return isNotFinished;
    }
}

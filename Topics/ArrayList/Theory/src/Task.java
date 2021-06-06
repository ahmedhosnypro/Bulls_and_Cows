// You can experiment here, it won’t be checked

import java.util.ArrayList;

public class Task {
  public static void main(String[] args) {
    // put your code here
    ArrayList<Character> characters = new ArrayList<>();

    characters.add('a');
    characters.add('b');
    characters.add(1, 'c');
    characters.add(1, 'd');
    characters.add('e');
    characters.add(5, 'f');
    characters.forEach(character -> System.out.print(String.valueOf(character)));
  }
}

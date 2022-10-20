package K;

import java.util.Scanner;

public class Main {

  static boolean isPalindromeOnlyChars(String phrase) {
    int[] chars = phrase.toLowerCase()
        .chars()
        .filter(Character::isAlphabetic)
        .toArray();
    for (int i = 0; i < chars.length / 2; ++i) {
      if (chars[i] != chars[chars.length - i - 1]) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      while (true) {
        String line = sc.nextLine();
        if ("DONE".equals(line)) return;
        System.out.println(isPalindromeOnlyChars(line) 
            ? "You won't be eaten!" 
            : "Uh oh..");
      }
    }
  }
}

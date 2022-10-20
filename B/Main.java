package B;

import java.util.*;

public class Main {
  

  /**
   * Check if a string have balanced parentisation.
   * 
   * @param line
   * @return true if line is balanced.
   */
  public static boolean isBalanced(String line) {
    ArrayDeque<Character> stack = new ArrayDeque<>();
    for (char c : line.toCharArray()) {
      switch (c) {
        case ')':
          if (stack.isEmpty() || stack.pollLast() != '(') return false;
          break;
        case ']':
          if (stack.isEmpty() || stack.pollLast() != '[') return false;
          break;
        case '(':
        case '[':
          stack.add(c);
      }
    }
    return stack.isEmpty();
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int t = Integer.parseInt(sc.nextLine());
      while (t-- > 0) {
        String line = sc.nextLine();
        System.out.println(isBalanced(line) ? "Yes" : "No");
      }
    }
  }
}

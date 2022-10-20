package E;

import java.util.Scanner;

public class Main {

  public static int josephus(int n, int k) {
    if (n == 1) return 1;
    return (josephus(n - 1, k) + k - 1) % n + 1;
  }

  public static void main(String[] args) {
    /** Josephus problem */
    try (Scanner sc = new Scanner(System.in)) {
      for (int n = sc.nextInt(); n != 0; n = sc.nextInt()) {
        /** Special case when n == 13 */
        if (n == 13) {
          System.out.println(1);
          continue;
        }
        for (int k = 1; k < 1000; ++k) {
          if (Math.floorMod(josephus(n, k) - (k - 1), n) == 13) {
            System.out.println(k);
            break;
          }
        }
      }
    }
  }
}

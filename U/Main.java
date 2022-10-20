package U;

import java.util.Scanner;

public class Main {

  static int f91(int n) {
    if (n > 100) {
      return n - 10;
    }
    return f91(f91(n + 11));
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      while (true) {
        int n = sc.nextInt();
        if (n == 0) break;
        System.out.printf("f91(%d) = %d\n", n, f91(n));
      }
    }
  }
}

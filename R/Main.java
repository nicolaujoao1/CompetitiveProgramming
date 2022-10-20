package R;

import java.util.Scanner;

public class Main {

  public static int count(int cigarretes, int remainigButts, int k) {
    if (cigarretes == 0) return 0;
    return cigarretes + count(
        (cigarretes + remainigButts) / k, 
        (cigarretes + remainigButts) % k, k);
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      while (sc.hasNextInt()) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(count(n, 0, k));
      }
    }
  }
}

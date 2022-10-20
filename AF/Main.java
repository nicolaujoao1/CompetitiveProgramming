package AF;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      while (sc.hasNextInt()) {
        double n = sc.nextDouble();
        double p = sc.nextDouble();
        // n-th root of p is equal to p^(1/n)
        double root = Math.pow(p, 1.0/n);
        System.out.printf("%.0f\n", root);
      }
    }
  }
}

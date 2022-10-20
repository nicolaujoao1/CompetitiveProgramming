package AK;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      while (true) {
        int n = sc.nextInt();
        if (n == 0) break;
        int parity = Integer.bitCount(n);
        String binary = Integer.toString(n, 2);
        System.out.printf("The parity of %s is %d (mod 2).\n", binary, parity);
      }
    }
  }
}

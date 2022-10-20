package AE;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        // problem limit
        final int MAX = 100_000;

        try (Scanner sc = new Scanner(System.in)) {
            // precomputate values
            TreeSet<Integer> tree = new TreeSet<>();
            for (int i = 1; i * i <= MAX; ++i) {
                tree.add(i * i);
            }
            while (true) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (a + b == 0) break;
                System.out.println(tree.subSet(a, b + 1).size());
            }
        }
    }
}

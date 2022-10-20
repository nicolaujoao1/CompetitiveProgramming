package D;

import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new BufferedInputStream(System.in))) {
            while (sc.hasNextInt()) {
                int n = sc.nextInt();
                if (n == 0) return;
                System.out.println(IntStream.generate(() -> sc.nextInt())
                    .limit(n)
                    .sorted()
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining(" ")));
            }
        }
    }
}

import java.util.*;

public class pTI2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int i;
            for (i = 1; i <= n; i++) {
                int j;
                for (j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                for (j = 1; j <= i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
}

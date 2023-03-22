/* Sajal and Ruhi are playing a game. Sajal is going to tell one number and one operation (Even, Odd, Prime and Factorial), Ruhi have to apply the operation and tell the
output. */

//code for Q2

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int op = sc.nextInt();

        switch (op) {
            case 1:
                if (n % 2 == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                break;
            case 2:
                if (n % 2 != 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                break;
            case 3:
                boolean isPrime = true;
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                break;
            case 4:
                BigInteger factorial = BigInteger.valueOf(1);
                for (int i = 1; i <= n; i++) {
                    factorial = factorial.multiply(BigInteger.valueOf(i));
                }
                System.out.println(factorial);
                break;
        }
    }
}

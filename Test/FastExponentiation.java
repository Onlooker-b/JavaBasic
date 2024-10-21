package Test;

import java.util.Scanner;

public class FastExponentiation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("输入基数 (a): ");
        long a = scanner.nextLong();

        System.out.print("输入幂 (b): ");
        long b = scanner.nextLong();

        System.out.print("输入除数 (n): ");
        long n = scanner.nextLong();

        long result = modularExponentiation(a, b, n);
        System.out.println(a + "^" + b + " mod " + n + " = " + result);
    }

    public static long modularExponentiation(long base, long exponent, long modulus) {
        long result = 1;
        base = base % modulus; // Take modulus initially

        while (exponent > 0) {
            // If exponent is odd, multiply the base with result
            if ((exponent & 1) == 1) {
                result = (result * base) % modulus;
            }

            // Right shift the exponent by 1 (equivalent to dividing by 2)
            exponent >>= 1;
            // Square the base
            base = (base * base) % modulus;
        }

        return result;
    }
}

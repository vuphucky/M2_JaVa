package loop_java;

import java.util.Scanner;

public class BT_20FirstPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size number: ");
        int size = sc.nextInt();
        int count = 0;

        for (int i = 2; count < size ; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
                count++;
            }
        }
    }
}

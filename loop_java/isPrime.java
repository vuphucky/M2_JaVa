package loop_java;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();

        if(num < 2){
            System.out.println(num + " is not prime");
        } else {
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0){
                    count++;
                }
            }
            if (count == 2){
                System.out.println(num + " is prime");
            } else {
                System.out.println(num + " is not prime");
            }
        }
    }
}

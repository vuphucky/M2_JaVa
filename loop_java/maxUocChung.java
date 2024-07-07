package loop_java;

import java.awt.*;
import java.util.Scanner;

public class maxUocChung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number a: ");
        int a = sc.nextInt();
        System.out.println("enter number b: ");
        int b = sc.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println(" no max common factor");
        } else {
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
        }
        System.out.println("max common factor = " + a);
    }
}

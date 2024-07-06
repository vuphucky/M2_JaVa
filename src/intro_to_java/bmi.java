package intro_to_java;

import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap cang nang ");
        double weight = scanner.nextDouble();
        System.out.println("nhap cang chieu cao ");
        double height = scanner.nextDouble();
        double bmi = weight / Math.pow(height,2) ;
        System.out.printf("%-20s%s","bmi","interpretation\n");

        if (bmi < 18) {
            System.out.printf("%-20s%s",bmi,"underweight");
        } else if (bmi <25.0) {
            System.out.printf("%-20s%s",bmi,"normal");
        } else if (bmi < 30.0) {
            System.out.printf("%-20s%s",bmi,"overweight");
        } else {
            System.out.printf("%-20s%s",bmi,"obese");
        }
    }
}

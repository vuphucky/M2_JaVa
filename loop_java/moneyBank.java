package loop_java;

import java.util.Scanner;

public class moneyBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("tien gui ngan hang: ");
        double money = sc.nextDouble();
        System.out.println("so thang gui: ");
        int month = sc.nextInt();
        System.out.println(" ti le lai: ");
        double rate = sc.nextDouble();

        double totalInterest = 0;
        for (int i = 0; i < month ; i++) {
            totalInterest += money * (rate/100) * month;
        }
        System.out.println("tong tien lai thu ve = " + totalInterest);
    }
}

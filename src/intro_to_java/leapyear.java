package intro_to_java;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so nam muon kiem tra: ");
        int year = scanner.nextInt();

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.print(year + " la nam nhuan");
        }else if (year % 400 == 0 && year % 100 == 0) {
            System.out.print(year + " la nam nhuan");
        } else {
            System.out.print(year + " khong phai nam nhuan");
        }
    }
}

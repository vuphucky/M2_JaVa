package intro_to_java;

import java.util.Scanner;

public class BT_sayhi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name ");
        String name = scanner.nextLine();

        System.out.println("hello: " + name);
    }
}

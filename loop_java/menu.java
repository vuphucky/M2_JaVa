package loop_java;

import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);

        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1.Draw triangle");
            System.out.println("2.Draw square");
            System.out.println("3.Draw rectangle");
            System.out.println("0.exit");

            System.out.println(" enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("draw triangle");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;

                case 2:
                    System.out.println("draw square");
                    System.out.println("*****");
                    System.out.println("*****");
                    System.out.println("*****");
                    System.out.println("*****");
                    System.out.println("*****");
                    break;

                case 3:
                    System.out.println("draw rectangle");
                    System.out.println("*****");
                    System.out.println("*****");
                    System.out.println("*****");
                    break;

                case 0:
                    System.exit(0);

                default:
                    System.out.println("no choice!");
            }
        }
    }
}

package intro_to_java;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class money {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("nhap so USD: ");
        double USD = sc.nextDouble();
        double rate = USD * 23000;
        System.out.print(USD + " USD " + " sang VND = " + rate);
    }
}

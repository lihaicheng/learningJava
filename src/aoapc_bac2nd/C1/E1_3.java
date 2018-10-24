package aoapc_bac2nd.C1;

import java.util.Scanner;

/**
 * 交换变量，如果就是想打印二者交换后的值，可以这样
 */
public class E1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(b + " " + a);
    }
}

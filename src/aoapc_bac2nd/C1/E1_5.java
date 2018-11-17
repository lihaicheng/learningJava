package aoapc_bac2nd.C1;

import java.util.Scanner;

public class E1_5 {
    public static void sort(int a, int b, int c)
    {
        int temp;
        if (a > b)
        {
            temp = a;
            a = b;
            b = temp;
        }
        if (a > c)
        {
            temp = a;
            a = c;
            c = temp;
        }
        if (b > c)
        {
            temp = b;
            b = c;
            c = temp;
        }
        System.out.print(a + " " + b + " " + c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sort(a, b, c);
    }
}

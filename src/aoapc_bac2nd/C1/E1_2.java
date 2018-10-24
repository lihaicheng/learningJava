package aoapc_bac2nd.C1;

import java.util.Scanner;

public class E1_2 {
    public static int reverse(String n)
    {
        char[] reverseNum = n.toCharArray();
        int start = 0;
        int end = reverseNum.length - 1;
        char temp;
        while (start < end)
        {
            temp = reverseNum[start];
            reverseNum[start] = reverseNum[end];
            reverseNum[end] = temp;
            start++;
            end--;
        }
        String resS = new String(reverseNum);
        int resI = Integer.parseInt(resS);
        return resI;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int res = reverse(n);
        System.out.print(res);
    }
}

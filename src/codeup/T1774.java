package codeup;

import java.util.Arrays;
import java.util.Scanner;

public class T1774 {
    public static void insertSort(int[] arr)
    {
    }
    public static String myToString(int[] arr)
    {
        int iMax = arr.length - 1;
        if (iMax < 0)
        {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; ; i++)
        {
            sb.append(arr[i]);
            if (i == iMax)
            {
                return sb.toString();
            }
            sb.append(" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        insertSort(arr);
        Arrays.sort(arr);
        System.out.print(myToString(arr));
    }
}

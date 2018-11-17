package nowcoder.exam.meituan1009;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main1 {
    public static int getResult(int n, int x, int[] a)
    {
        int[] dp = new int[n];
        for (int i = 0 ; i < n ; i++)
        {

        }
        return 23;
    }
    public static int getResult1(int n, int x, int[] a)
    {
        Set<Integer> si = new HashSet<>();
        Set<Integer> sitemp = new HashSet<>();
        si.add(a[0]);
        int min = 9999999;
        if (a[0] > x)
        {
            min = a[0];
        }
        for (int i = 1 ; i < n ; i++)
        {
            Iterator it = si.iterator();
            while (it.hasNext())
            {
                int temp = (int)it.next();
                //System.out.println(temp);
                sitemp.add(a[i]);
                sitemp.add(temp+a[i]);
                if (temp+a[i] > x && temp+a[i] < min)
                {
                    min = temp+a[i];
                }
            }
            it = sitemp.iterator();
            while (it.hasNext())
            {
                int temp = (int)it.next();
                //System.out.println(temp);
                si.add(temp);
            }
            sitemp.clear();
        }
        System.out.println(min);
        return 23;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//arr.size
        int x = sc.nextInt();//券值
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++)
        {
            a[i] = sc.nextInt();
        }
        int res = getResult1(n, x, a);
        //System.out.println(res);

    }
}

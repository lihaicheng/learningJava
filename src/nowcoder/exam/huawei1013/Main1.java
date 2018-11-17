package nowcoder.exam.huawei1013;

import java.util.Scanner;

public class Main1 {
    public static void getRes(int n, int m)
    {
        boolean[] arr = new boolean[n];
        int leftCount = n;
        int countNum = 0;
        int index = 0;
        while(leftCount > 1)
        {
            if(!arr[index])
            {
                countNum++;
                if(countNum == m)
                {
                    countNum =0;
                    arr[index] = true;
                    System.out.print(index+1+ " ");
                    leftCount --;
                }
            }

            index ++;

            if(index == arr.length)
            {
                index = 0;
            }
        }
        for(int i=0; i<arr.length;i++)
        {
            if(!arr[i])
            {
                System.out.println(i+1);
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0 ; j < t ; j++)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            getRes(n, m);
        }


    }
}

package nowcoder.exam.shunfeng0917;

import java.util.Scanner;

public class Main2 {

    public static void getRes(int n, int[] h, int maxh)
    {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = Integer.parseInt(sc.nextLine());

        for (int i = 0 ; i < m ; i ++)
        {
            String o = sc.nextLine();
            String ao = " "+sc.nextLine()+" ";
            String[] split = ao.split(o);
            System.out.println(split.length-1);
        }

    }
}

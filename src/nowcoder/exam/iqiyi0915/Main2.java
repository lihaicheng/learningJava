package nowcoder.exam.iqiyi0915;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nmp = sc.nextLine().split(" ");
        int n = Integer.parseInt(nmp[0]);
        int m = Integer.parseInt(nmp[1]);
        int p = Integer.parseInt(nmp[2]);
        int[] ai = new int[n];
        String[] input = sc.nextLine().split(" ");
        for (int i = 0 ; i < n ; i++)
        {
            ai[i] = Integer.parseInt(input[i]);
        }
        for (int i = 0 ; i < m ; i++)
        {
            String[] opt = sc.nextLine().split(" ");
            int index = Integer.parseInt(opt[1]) - 1;
            if (opt[0].equals("A"))
            {
                ai[index] ++;
            }
            else
            {
                ai[index] --;
            }
        }
        int more = 0;
        int total = ai[p-1];
        for (int i = 0 ; i < n ; i++)
        {
            if (ai[i] > total)
            {
                more++;
            }
        }
        System.out.println(more+1);

    }
}

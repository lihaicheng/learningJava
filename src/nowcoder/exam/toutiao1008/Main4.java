package nowcoder.exam.toutiao1008;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main4 {

    public static void getRes(int k, ArrayList<ArrayList<String>> arr)
    {
        int sizex = arr.size();
        int sizey = arr.get(0).size();
        int[][] res = new int[sizex][sizey];

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = Integer.parseInt(in.nextLine());
        ArrayList<ArrayList<String>> arr = new ArrayList<>();
        ArrayList<Integer> arry = new ArrayList<>();
        while (in.hasNextInt()) {//注意while处理多个case
            String[] a = in.nextLine().split(",");
            arr.add(new ArrayList<>(Arrays.asList(a)));
        }
        getRes(k, arr);

    }
}

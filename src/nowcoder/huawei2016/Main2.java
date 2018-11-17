package nowcoder.huawei2016;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {
    public static int getResult(int n)
    {
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> infos = new HashMap<>();
        int nums = 0;

        while (sc.hasNextLine() && nums < 8)
        {
            String info = sc.nextLine();
            if (infos.containsKey(info))
            {
                infos.put(info, infos.get(info)+1);
            }
            else
            {
                infos.put(info, 1);
            }
            nums++;
        }
        while (sc.hasNextLine())
        {
            String info = sc.nextLine();
            if (infos.containsKey(info))
            {
                infos.put(info, infos.get(info)+1);
            }
        }
        for (String str : infos.keySet())
        {
            String[] res = str.split(" ");
            String lines = res[res.length-1];
            String[] path = res[res.length-2].split("\\\\");
            String file = path[path.length-1];
            if (file.length() > 16)
            {
                file = file.substring(file.length()-16);
            }
            System.out.println(file + " " + lines + " " + infos.get(str));
        }
    }
}

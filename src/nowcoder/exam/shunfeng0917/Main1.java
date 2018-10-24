package nowcoder.exam.shunfeng0917;

import java.util.*;

public class Main1 {
    public static void getRes(String str)
    {
        String[] words = str.split(" ");
        HashMap<String, Integer> hashMap = new HashMap<>();
        int times = 0;
        for (int i = 0 ; i < words.length ; i++)
        {
            words[i] = words[i].toLowerCase();
            if (!words[i].equals(""))
            {
                if (hashMap.containsKey(words[i]))
                {
                    times = hashMap.remove(words[i]) + 1;
                    hashMap.put(words[i], times);
                }
                else
                {
                    hashMap.put(words[i], 1);
                }
            }

        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>();
        list.addAll(hashMap.entrySet());
        ValueComp vc = new ValueComp();
        Collections.sort(list, vc);

        System.out.print("[");
        boolean first = true;
        for (Iterator<Map.Entry<String, Integer>> it = list.iterator();it.hasNext();)
        {
            String[] kv = it.next().toString().split("=");
            if (first)
            {
                System.out.print("('"+kv[0]+"', "+kv[1]+")");
                first = false;
            }
            else
            {
                System.out.print(", ('"+kv[0]+"', "+kv[1]+")");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        getRes(str);

    }
}

class ValueComp implements Comparator<Map.Entry<String, Integer>>
{
    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        if (o2.getValue() - o1.getValue() != 0)
        {
            return o2.getValue() - o1.getValue();
        }
        else
        {
            return o1.getKey().compareTo(o2.getKey());
        }

    }
}
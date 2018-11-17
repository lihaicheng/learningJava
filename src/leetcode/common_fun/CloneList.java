package leetcode.common_fun;

import java.util.ArrayList;
import java.util.List;

public class CloneList {
    public static void main(String[] args) {
        List<Integer> item = new ArrayList<>();
        item.add(1);
        item.add(2);
        item.add(3);
        List<Integer> temp = new ArrayList<>(item);
        temp.add(4);
        for(Integer i : item)
        {
            System.out.println(i);
        }
        for(Integer i : temp)
        {
            System.out.println(i);
        }
    }


}

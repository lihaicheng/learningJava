package leetcode.section4recursive_backtrack_DivideAndConquer;

import java.util.ArrayList;
import java.util.List;

public class L22 {
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder item = new StringBuilder();
        generate(n, n, item, result);
        return result;

    }
    public static void generate(int left, int right, StringBuilder item, List<String> result) {
        if(left == 0 && right == 0)
        {
            result.add(item.toString());
            return;
        }
        if(left > 0)
        {
            StringBuilder temp1 = new StringBuilder(item);
            temp1.append('(');
            generate(left-1, right, temp1, result);
        }
        if(left < right)
        {
            StringBuilder temp2 = new StringBuilder(item);
            temp2.append(')');
            generate(left, right-1, temp2, result);
        }
    }
    public static void main(String[] args) {
        int n = 3;
        List<String> parenthesis = generateParenthesis(n);
        for (int i = 0; i < parenthesis.size(); i++) {
            System.out.print(parenthesis.get(i));
            System.out.println();
        }

    }
}

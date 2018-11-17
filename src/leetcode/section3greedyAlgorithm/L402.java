package leetcode.section3greedyAlgorithm;

import java.util.Deque;
import java.util.LinkedList;

public class L402
{
    public static String removeKdigits(String num, int k) {
        StringBuilder result = new StringBuilder();
        Deque<Character> deque = new LinkedList();
        for(int i = 0 ; i < num.length() ; i++)
        {
            char n = num.charAt(i);
            /*
            移除数字
             */
            while(!deque.isEmpty() && deque.peekLast() > n && k > 0)
            {
                deque.pollLast();
                k--;
            }
            /*
            当一个数字需要考虑入栈，有两种情况
                为0，不为0
            当不为0，可以直接入栈
            n != '0'，
            当为0，如果栈内有元素，可以直接入栈，如果栈内没有元素，0不能做开头
            deque.size() != 0，
             */
            if(n != '0' || deque.size() != 0)
            {
                deque.offerLast(n);
            }

        }
        while(!deque.isEmpty() && k > 0)
        {
            deque.pollLast();
            k--;
        }
        while(!deque.isEmpty())
        {
            result.append(deque.removeFirst());
        }
        String res = result.toString();
        if(res.equals(""))
        {
            return "0";
        }

        return res;
    }

    public static void main(String[] args)
    {
        String num = "9";
        int k = 2;
        System.out.println(removeKdigits(num,  k));

    }
}

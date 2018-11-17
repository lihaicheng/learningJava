package nowcoder.exam.wangyi2019shixi;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int t = Integer.parseInt(str);
        for(int i = 0 ; i < t ; i++)
        {
        	str = sc.nextLine();
        	int n = Integer.parseInt(str);
        	str = sc.nextLine();
        	String[] strs = str.split("X");
        	int sum = 0;
        	for(String s : strs)
        	{
        		sum += s.length() / 3;
        		sum += (s.length() % 3 == 0 ? 0 : 1);
        	}
        	System.out.println(sum);
        }
	}
}

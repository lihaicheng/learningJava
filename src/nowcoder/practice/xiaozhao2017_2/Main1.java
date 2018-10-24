package nowcoder.practice.xiaozhao2017_2;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        //String str = sc.nextLine();
        //String[] strs = str.split(" ");
        int id1 = sc.nextInt();
        int id2 = sc.nextInt();
        if(id1 < 1 || id1 > 1024 || id2 < 1 || id2 > 1024)
        {
        	System.out.println(-1);
        }
        else
        {
        	if(id1 == id2)
            {
            	System.out.println(1);
            }
            else
            {
            	System.out.println(0);
            }
        }
        
	}

}

package nowcoder.practice.aiqiyi2018;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = 0;
        if(x1 == x2)
        {
        	for(int i = 2; i < n; i++){
        		x3 = sc.nextInt();
            	if(x1 != x3)
            	{
            		System.out.println(i+1);
            		return;
            	}
            } 
        }
        else if(x1 != x2)
        {
        	for(int i = 2; i < n; i++){
        		x3 = sc.nextInt();
            	if(x1 != x3)
            	{
            		System.out.println(1);
            		return;
            	}
            	else
            	{
            		System.out.println(2);
            		return;
            	}
            } 
        }
        
	}

}

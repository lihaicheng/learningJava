package nowcoder.practice.aiqiyi2018;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int[] x = new int[3];
        /*x[0] = sc.nextInt();
        x[1] = sc.nextInt();
        x[2] = sc.nextInt();*/
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        int temp = 0;
        int time = 0;
        /*int xMax = Math.max(Math.max(x[0], x[1]), x[2]);
        int xMin = */
        if(x1 <= x2)
        {}
        else
        {
        	temp = x1;
        	x1 = x2;
        	x2 = temp;
        }
        if(x2 <= x3)
        {}
        else if(x1 <= x3 && x3 < x2)
        {
        	temp = x3;
        	x3 = x2;
        	x2 = temp;
        }
        else if(x3 < x1)
        {
        	temp = x3;
        	x3 = x2;
        	x2 = x1;
        	x1 = temp;
        }
        //System.out.print(x1 + " "+x2 + " "+ x3 + " ");
        if(x1 != x2)
        {
        	if((x2 - x1)%2 == 0)
            {
            	time = time + (x2-x1)/2;
            	x1 = x2;
            }
            else
            {
            	int pow = (x2-x1)/2;
            	time = time + pow + 1;
            	x1 = x2;
            	x3 = x3 + 1;
            }
        }
        time = time + x3 - x2;
        System.out.println(time);
        
	}

}

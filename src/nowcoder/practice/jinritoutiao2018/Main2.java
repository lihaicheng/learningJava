package nowcoder.practice.jinritoutiao2018;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean end = false;
		Scanner sc = new Scanner(System.in);
        while(!end)
        {
        	
        	
        	
        	String line1 = sc.nextLine();
        	//System.out.println(line1);
            int m = Integer.parseInt(line1.substring(0, 1));
            int n = Integer.parseInt(line1.substring(2, 3));
            String[] pres = new String[m];
            String[] strs = new String[n];
            for(int i = 0 ; i < m ; i ++)
            {
            	pres[i] = sc.nextLine();
            	//System.out.println(pres[i]);
            }
            sc.nextLine();
            for(int i = 0 ; i < n ; i ++)
            {
            	strs[i] = sc.nextLine();
            	//System.out.println(strs[i]);
            }
            
            for(int i = 0 ; i < n ; i ++)
            {
            	for(int j = 0 ; j < m ; j ++)
            	{
            		//System.out.println(strs[i]);
        			//System.out.println(pres[j]);

        			//System.out.println(pres[j].length());
            		if(strs[i].substring(0, pres[j].length()).equals(pres[j]) )
            		{
            			System.out.println(1);
            			break;
            		}
            		if(j == m-1)
            		{
            			System.out.println(-1);
            		}
            	}
            	
            }
            if(!sc.hasNext())
            {
            	end = true;
            }
            else
            {
            	sc.nextLine();
            	System.out.println();
            }
        	
        }
        
        
        //System.out.println(m + n);
        
        
	}

}

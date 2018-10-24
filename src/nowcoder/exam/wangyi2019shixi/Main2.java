package nowcoder.exam.wangyi2019shixi;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        if(l > r || l < 1 || r < 1)
        {
        	return;
        }
        int sum = 0;
        int templ = l;
        int ten = templ / 10;
        int single = templ % 10;
        while(templ > 0)
        {
        	if(ten > 0)
        	{
        		sum += ten * (1 + (single + 1)) * (single + 1) >> 1;
        		templ = (ten - 1) * 10 + 9;
        		ten = templ / 10;
                single = templ % 10;
        	}
        	else
        	{
        		sum += ((1 + single) * single) >> 1;
        		break;
        	}
        }
        int count = 0;
        if(sum % 3 == 0)
        {
        	count = 1;
        }
        for(int i = l + 1 ; i <= r ; i++)
        {
        	ten = i / 10;
            single = i % 10;
            sum += single;
            while(ten != 0)
            {
            	single = ten % 10;
                sum += single;
                ten = ten / 10;
            }
            if(sum % 3 == 0)
            {
            	count++;
            }
        }
        
        
        System.out.println(count);
        
	}

}

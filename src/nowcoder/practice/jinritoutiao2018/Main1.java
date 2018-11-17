package nowcoder.practice.jinritoutiao2018;

import java.util.Scanner;

public class Main1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//统计个数
		int n = 0;
		//是否进入引号
		boolean quotationMark = false;
		//是否进入多行注释
		boolean multilineComment = false;
		//结束
		boolean eof = false;
		String line = "";
        Scanner sc = new Scanner(System.in);
        while(!eof)
        {
        	line = sc.nextLine();
        	char[] chars = line.toCharArray();
        	for(int i = 0 ; i < chars.length ; i ++)
        	{
        		if(quotationMark)
        		{
        			//如果在引号内，并且不是引号忽略该字符
        			if(chars[i] == '"')
            		{
            			//如果是引号，表示离开引号
            			quotationMark = false;
            		}
        		}
        		//如果不在引号内
        		else if(chars[i] == '"' && quotationMark == false)
        		{
        			//如果是引号，表示进入引号
        			quotationMark = true;
        		}
        		//如果不在引号内，碰到/符号
        		else if(chars[i] == '/' && quotationMark == false)
        		{
        			if(chars[i+1] == '/')
        			{
        				//两个连需//，进入单行注释
        				n++;
        				//System.out.println(n);
        				break;
        			}
        			if(chars[i+1] == '*')
        			{
        				//两个连需/*，进入多行注释
        				n++;
        				i++;
        				multilineComment = true;
        			}
        		}
        		//如果不在引号内，碰到*符号,并且在多行注释内
        		else if(chars[i] == '*' && quotationMark == false && multilineComment == true)
        		{
        			if(chars[i+1] == '/')
        			{
        				//两个连需*/，离开多行注释
        				i++;
        				multilineComment = false;
        			}
        		}
        		
        	}
        }
        sc.close();
        System.out.println(n);
        
        
	}

}

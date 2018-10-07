package languageDemo.demo;

import java.util.Arrays;


//import static hclee.language.tools.MyPrint.*;
public class Demo {

	static void sort()
	{
		String s = "abcfed";
		char[] cs = s.toCharArray();
		Arrays.sort(cs);
		String sortedS = String.valueOf(cs);
		System.out.print(sortedS);
	}
	static void string()
	{
		String s = "aa,bb,cc,";
		String result = s.substring(0, s.length()-1);
		System.out.print(result);
	}
	static void foreach()
	{
		String[] values = {"aa","bb","cc"};
		String s = "";
		for(String val : values)
		{
			s += (val + ",");
		}
		System.out.print(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(100 + 5 +" is");
	}

}

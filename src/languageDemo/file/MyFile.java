package languageDemo.file;
// import static hclee.language.tools.MyPrint.*;
import java.io.File;

public class MyFile
{
	public static void my()
	{
		File out = new File("D://学习/大讲台hadoop/73");
		File[] files = out.listFiles();
		for(File f : files)
		{
			if(f.isDirectory())
			{
				System.out.print(f.getAbsoluteFile()+"");
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		my();
	}

}

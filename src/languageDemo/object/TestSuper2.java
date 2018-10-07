package languageDemo.object;
//import static hclee.language.tools.MyPrint.*;
public class TestSuper2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		son2 s = new son2();
		//print(s.i);
		System.out.print(((Father2)s).i);

	}

}
class Father2
{
	public int i = 5;
}
class son2 extends Father2
{
	private int i = 7;
}
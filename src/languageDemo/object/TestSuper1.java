package languageDemo.object;
//import static hclee.language.tools.MyPrint.*;
public class TestSuper1 extends father
{

	//int i = 7;
	public void showMyI()
	{
		System.out.print(i+"");
	}
	public void showFatherI()
	{
		System.out.print(super.i+"");
	}
	public void myFun()
	{
		super.myFun();//super();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSuper1 t = new TestSuper1();
		t.showMyI();
		t.showFatherI();
	}

}
class father
{
	int i = 5;
	public void myFun()
	{
		System.out.print("futher fun");
	}
}
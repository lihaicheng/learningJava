package languageDemo.object;

public class TestSuper3 extends Father3{

	public int j;
	public TestSuper3(int j) {
		// TODO Auto-generated constructor stub
		
		super(j);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSuper3 t3 = new TestSuper3(0);

		System.out.println(t3.i);
	}

}
class Father3
{
	public int i;
	public Father3(int i)
	{
		this.i = 1;
	}
	public Father3()
	{
		this.i = 2;
	}
}
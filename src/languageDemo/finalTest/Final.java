package languageDemo.finalTest;

public class Final implements father{
	final int i = 3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final f = new Final();
		
		System.out.println(f.i);
		//f.i = 4;
		//f.b = 6;
		System.out.println(f.b);
	}

}
interface father
{
	int b = 5;
}
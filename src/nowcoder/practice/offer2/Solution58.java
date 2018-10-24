package nowcoder.practice.offer2;

public class Solution58 {
	public static String ReverseSentence(String str) {
		if(str == null)
		{
			return null;
		}
		String[] words = str.split(" ");
		if(words.length == 0)
		{
			return str;
		}
		StringBuffer sb = new StringBuffer();
		for(int i = words.length-1 ; i > 0 ; i--)
		{
			sb.append(words[i] + " ");
		}
		sb.append(words[0]);
		return sb.toString();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "i am a student.";
		System.out.println(ReverseSentence(str));
	}

}

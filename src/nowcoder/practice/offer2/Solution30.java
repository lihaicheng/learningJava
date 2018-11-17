package nowcoder.practice.offer2;
import java.util.Stack;

public class Solution30{
	Stack s1 = new Stack<Integer>();
	Stack s2 = new Stack<Integer>();
	public void push(int node) {
		s1.push(node);

	}

	public void pop() {
		s1.pop();
	}

	public int top() {
		return (int) s1.pop();

	}

	public int min() {
		int min = (int) s1.pop();
		s2.push(min);
		int temp;
		while(!s1.isEmpty())
		{
			temp = (int) s1.pop();
			s2.push(temp);
			if(min >= temp)
			{
				min = temp;
			}
		}
		while(!s2.isEmpty())
		{
			s1.push(s2.pop());
		}
		return min;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

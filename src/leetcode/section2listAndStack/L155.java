package leetcode.section2listAndStack;

import java.util.Stack;

public class L155 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack obj = new MinStack();
		obj.push(1);
		obj.push(2);
		obj.pop();
		int param_3 = obj.top();
		System.out.println(param_3);
		int param_4 = obj.getMin();

		System.out.println(param_3 + " " + param_4);
	}

}

class MinStack {
	Stack data;
	Stack min;

	/** initialize your data structure here. */
	public MinStack() {
		data = new Stack<Integer>();
		min = new Stack<Integer>();
	}

	public void push(int x) {
		
		if(data.isEmpty())
		{
			data.push(x);
			min.push(x);
		}
		else
		{
			int temp = (int) min.peek(); 
			if(temp <= x)
			{
				data.push(x);
				min.push(temp);
			}
			else
			{
				data.push(x);
				min.push(x);
			}
		}

	}

	public void pop() {
		data.pop();
		min.pop();

	}

	public int top() {
		return (int) data.peek();

	}

	public int getMin() {
		return min.isEmpty() ? null : (int) min.peek();
	}
}
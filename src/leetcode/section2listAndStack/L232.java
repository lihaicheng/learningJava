package leetcode.section2listAndStack;

import java.util.Stack;

public class L232 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue obj = new MyQueue();
		obj.push(1);
		obj.push(2);  
		int param_2 = obj.pop();
		int param_3 = obj.peek();
		boolean param_4 = obj.empty();

		System.out.println(param_2 + " " + param_3 + " " + param_4);
	}

}

class MyQueue {

	Stack s1;
	Stack s2;
	/** Initialize your data structure here. */
	public MyQueue() {
		s1 = new Stack<Integer>();
		s2 = new Stack<Integer>();
	}

	/** Push element x to the back of queue. */
	public void push(int x) {
		s1.push(x);

	}

	/** Removes the element from in front of queue and returns that element. */
	public int pop() {
		int temp;
		while(!s1.isEmpty())
		{
			s2.push(s1.pop());
		}
		temp = (int) s2.pop();
		while(!s2.isEmpty())
		{
			s1.push(s2.pop());
		}
		return temp;

	}

	/** Get the front element. */
	public int peek() {
		int temp;
		while(!s1.isEmpty())
		{
			s2.push(s1.pop());
		}
		temp = (int) s2.pop();
		s1.push(temp);
		while(!s2.isEmpty())
		{
			s1.push(s2.pop());
		}
		return temp;
	}

	/** Returns whether the queue is empty. */
	public boolean empty() {
		return s1.isEmpty();

	}
}

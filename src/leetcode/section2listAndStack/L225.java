package leetcode.section2listAndStack;

import java.util.ArrayList;
import java.util.List;

public class L225 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack obj = new MyStack();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		int param_2 = obj.pop();
		int param_3 = obj.top();
		boolean param_4 = obj.empty();
		
		System.out.println(param_2 + " " + param_3 + " " +param_4);
	}

}

class MyStack {
	List l1 ;
	List l2 ;
    /** Initialize your data structure here. */
    public MyStack() {
        l1 = new ArrayList<Integer>();
        l2 = new ArrayList<Integer>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        l1.add(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
    	int temp = (int) l1.remove(0);
    	while(!l1.isEmpty())
    	{
    		l2.add(temp);
    		temp = (int) l1.remove(0);
    	}
    	while(!l2.isEmpty())
    	{
    		l1.add(l2.remove(0));
    	}
    	return temp;
        
    }
    
    /** Get the top element. */
    public int top() {
    	int temp = (int) l1.remove(0);
    	while(!l1.isEmpty())
    	{
    		l2.add(temp);
    		temp = (int) l1.remove(0);
    	}
    	while(!l2.isEmpty())
    	{
    		l1.add(l2.remove(0));
    	}
    	l1.add(temp);
    	return temp;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return l1.isEmpty();
    }
}
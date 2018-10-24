package nowcoder.practice.offer2;

import java.util.Stack;

public class Solution9 {
	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    /*public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
    	Integer head;
    	Integer temp;
    	if(!stack2.isEmpty())
    	{
    		head = stack2.pop();
    		return head;
    	}
    	else
    	{
    		while(!stack1.isEmpty())
    		{
    			temp = stack1.pop();
    			stack2.push(temp);
    		}
    		return stack2.pop();
    	}
    }*/
    
    public void push(int node) {
    	stack1.push(node);
    }
    
    public int pop() {
    	if(!stack2.isEmpty())
    	{
    		return stack2.pop();
    	}
    	else
    	{
    		while(!stack1.isEmpty())
    		{
    			stack2.push(stack1.pop());
    		}
    		return stack2.pop();
    	}
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution9 s9 = new Solution9();
		s9.push(1);
		s9.push(2);
		s9.push(3);
		/*System.out.println(s9.stack2.isEmpty());
		int i1 = s9.stack2.pop();
		System.out.println("i1=" + i1);*/
		int i1 = s9.pop();
		System.out.println("i1=" + i1);
		int i2 = s9.pop();
		System.out.println("i2=" + i2);
		s9.push(4);
		int i3 = s9.pop();
		System.out.println("i3=" + i3);
		s9.push(5);
		int i4 = s9.pop();
		System.out.println("i4=" + i4 );
		int i5 = s9.pop();
		System.out.println("i5=" + i5 );

	}

}

package examTreasure.dataStructure.S8_2Stack;

import java.util.Stack;

public class T8_2_3 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(4);
        System.out.print(stack.getMin());
        stack.push(3);
        System.out.print(stack.getMin());
        stack.push(5);
        System.out.print(stack.getMin());
        stack.pop();
        System.out.print(stack.getMin());
        stack.pop();
        System.out.print(stack.getMin());
    }

}
class MyStack{
    Stack<Integer> ele;
    Stack<Integer> min;
    public MyStack()
    {
        ele = new Stack<>();
        min = new Stack<>();
    }
    public void push(int data)
    {
        ele.push(data);
        if (min.isEmpty())
        {
            min.push(data);
        }
        else if (min.peek() > data)
        {
            min.push(data);
        }
        else
        {
            min.push(min.peek());
        }
    }
    public int pop()
    {
        min.pop();
        return ele.pop();
    }
    public int getMin()
    {
        return min.peek();
    }
}
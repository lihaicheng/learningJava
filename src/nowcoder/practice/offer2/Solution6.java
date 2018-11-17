package nowcoder.practice.offer2;

import java.util.ArrayList;

public class Solution6 {
	/*public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> ai = new ArrayList<Integer>();
		Stack<ListNode> stack = new Stack<>();
		while(listNode != null)
		{
			stack.push(listNode);
			listNode = listNode.next;
		}
		while(!stack.isEmpty())
		{
			ai.add(stack.pop().val);
		}
		
		return ai;
	}*/
	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> ai = new ArrayList<Integer>();
		ArrayList<Integer> ai1 = new ArrayList<Integer>();
		ListNode p = listNode;
		while(p != null)
		{
			ai.add(p.val);
			p = p.next;
		}
		for(int i = ai.size() - 1 ; i >= 0 ;i --)
		{
			ai1.add(ai.get(i));
		}
		return ai1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n0 = new ListNode(0);
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		n0.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		ArrayList<Integer> ai = printListFromTailToHead(n0);
		//ArrayList<Integer> ai = new ArrayList<>();
		System.out.println(ai);

	}

}


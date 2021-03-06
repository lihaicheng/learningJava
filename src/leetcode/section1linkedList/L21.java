package leetcode.section1linkedList;

public class L21 {
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null)
		{
			return l2;
		}
		if(l2 == null)
		{
			return l1;
		}
		ListNode newHead = null;
		ListNode p1 = l1;
		ListNode p2 = l2;
		ListNode temp = null;
		
		if(p1.val <= p2.val)
		{
			newHead = p1;
			temp = p1;
			p1 = p1.next;
		}
		else
		{
			newHead = p2;
			temp = p2;
			p2 = p2.next;
		}
		
		while(p1 != null && p2 != null)
		{
			if(p1.val <= p2.val)
			{
				temp.next = p1;
				temp = temp.next;
				p1 = p1.next;
			}
			else
			{
				temp.next = p2;
				temp = temp.next;
				p2 = p2.next;
			}
		}
		
		if(p1 == null)
		{
			temp.next = p2;
		}
		else
		{
			temp.next = p1;
		}
		
		return newHead;
	}
	public static void show(ListNode head) {
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		ListNode n6 = new ListNode(6);

		n1.next = n3;
		n3.next = n5;
		n5.next = null;
		n2.next = n4;
		n4.next = n6;
		n6.next = null;
		
		show(mergeTwoLists(n1,n2));
	}

}

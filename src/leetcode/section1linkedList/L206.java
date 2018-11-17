package leetcode.section1linkedList;

public class L206 {
	public static ListNode reverseList(ListNode head) {
		if(head == null)
		{
			return null;
		}
		if(head.next == null)
		{
			return head;
		}
		ListNode p1,p2,p3;
		p1 = head;
		p2 = head.next;
		p3 = p2.next;
		p1.next = null;
		while(p3 != null)
		{
			p2.next = p1;
			p1 = p2;
			p2 = p3;
			p3 = p3.next;
		}
		p2.next = p1;
		return p2;
	}
	public static void show(ListNode head) 
	{
		while(head != null)
		{
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
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = null;
		
		show(n1);
		System.out.println("==========");
		
		ListNode newHead = reverseList(n1);
		
		show(newHead);

	}

}

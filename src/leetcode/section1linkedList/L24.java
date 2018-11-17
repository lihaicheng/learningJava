package leetcode.section1linkedList;

public class L24 {

	public static ListNode swapPairs(ListNode head) {
		if(head == null || head.next == null)
		{
			return head;
		}
		ListNode p1 = head;
		ListNode p2 = head.next;
		ListNode p3 = null;
		ListNode newHead = head.next;
		while(p1 != null && p2 != null)
		{
			
			p3 = p2.next;
			if(p3 == null || p3.next == null)
			{
				p1.next = p3;
				p2.next = p1;
				break;
			}
			p1.next = p3.next;
			p2.next = p1;
			
			p1 = p3;
			p2 = p1.next;
			
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
		

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = null;
		
		show(swapPairs(n1));
		
	}

}

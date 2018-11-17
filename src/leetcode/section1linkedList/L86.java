package leetcode.section1linkedList;

public class L86 {

	public static ListNode partition(ListNode head, int x) {
		if(head == null && head.next == null)
		{
			return head;
		}
		ListNode oldHead = head;
		ListNode p1 = head;
		ListNode p2 = null;
		ListNode newHead = null;
		
		
		while(p1 != null && p1.val >= x)
		{
			p1 = p1.next;
		}
		
		return head;

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
		

		n1.next = n4;
		n2.next = n3;
		n3.next = n4;
		n4.next = n2;
		n5.next = null;
		
		show(partition(n1, 3));
	}

}

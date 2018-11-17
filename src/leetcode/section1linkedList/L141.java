package leetcode.section1linkedList;

public class L141 {
	public static boolean hasCycle(ListNode head) {
		ListNode q = head;
		ListNode s = head;
		while(q != null && q.next != null)
		{
			q = q.next.next;
			s = s.next;
			if(q == s)
			{
				return true;
			}
		}
		return false;
			
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
		
		System.out.println(hasCycle(n1));
	}

}

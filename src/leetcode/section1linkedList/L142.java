package leetcode.section1linkedList;

public class L142 {
	public static ListNode detectCycle(ListNode head) {
		ListNode q = head;
		ListNode s = head;
		while(q != null && q.next != null)
		{
			q = q.next.next;
			s = s.next;
			if(q == s)
			{
				q = head;
				while(q != s)
				{
					q = q.next;
					s = s.next;
				}
				return q;
			}
		}
		return null;
			
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
		n5.next = n3;
		
		System.out.println(detectCycle(n1) == null ? "null" : detectCycle(n1).val);
	}

}

package leetcode.section1linkedList;

public class L160 {
	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		int lenA = 0;
		int lenB = 0;
		ListNode pA = headA;
		ListNode pB = headB;
		while(pA != null)
		{
			lenA++;
			pA = pA.next;
		}
		while(pB != null)
		{
			lenB++;
			pB = pB.next;
		}
		pA = headA;
		pB = headB;
		if(lenA > lenB)
		{
			for(int i = 0 ; i < lenA - lenB ; i++)
			{
				pA = pA.next;
			}
		}
		else if(lenA < lenB)
		{
			for(int i = 0 ; i < lenB - lenA ; i++)
			{
				pB = pB.next;
			}
		}
		while(pA != null && pB != null && pA != pB)
		{
			pA = pA.next;
			pB = pB.next;
		}
		if(pA == null)
		{
			return null;
		}
		else
		{
			return pA;
		}

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
		

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = null;
		n6.next = n3;

		/*show(n1);
		System.out.println("==========");
		show(n6);*/
		System.out.println("==========");
		show(getIntersectionNode(n1, n6));
	}

}

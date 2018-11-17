package nowcoder.practice.offer2;

public class Solution52 {
	public static ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		ListNode h1 = pHead1;
		ListNode h2 = pHead2;
		ListNode p1 = h1;
		ListNode p2 = h2;
		int num1 = 0;
		int num2 = 0;
		while(p1 != null)
		{
			num1++;
			p1 = p1.next;
		}
		while(p2 != null)
		{
			num2++;
			p2 = p2.next;
		}
		p1 = h1;
		p2 = h2;
		if(num1 > num2)
		{
			for(int i = 0 ; i < num1 - num2 ; i++)
			{
				p1 = p1.next;
			}
		}
		else if(num1 < num2)
		{
			for(int i = 0 ; i < num2 - num1 ; i++)
			{
				p2 = p2.next;
			}
		}
		while(p1 != p2)
		{
			p1 = p1.next;
			p2 = p2.next;
		}
		return p1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode pHead1 = new ListNode(10);
		ListNode pHead2 = new ListNode(20);
		ListNode n11 = new ListNode(11);
		ListNode n21 = new ListNode(21);
		ListNode n12 = new ListNode(12);
		ListNode n13 = new ListNode(13);
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		pHead1.next = n11;
		n11.next = n12;
		n12.next = n13;
		n13.next = n1;
		pHead2.next = n21;
		n21.next = n1;
		n1.next = n2;
		n2.next = n3;
		
		System.out.println(FindFirstCommonNode(pHead1,pHead2).val);

	}

}

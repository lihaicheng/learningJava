package nowcoder.practice.offer2;

public class Solution22 {
	public static ListNode FindKthToTail(ListNode head,int k) {
		if(head == null)
		{
			return null;
		}
		ListNode p1 = head;
		ListNode p2 = head;
		for(int i = 0 ; i < k ; i++)
		{
			if(p1 == null)
			{
				return null;
			}
			p1 = p1.next;
			
		}
		while(p1 != null)
		{
			p1 = p1.next;
			p2 = p2.next;
		}
		return p2;
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

		System.out.println(FindKthToTail(n0 , 0).val);

	}

}

class ListNode22 {
    int val;
    ListNode next = null;

    ListNode22(int val) {
        this.val = val;
    }
}
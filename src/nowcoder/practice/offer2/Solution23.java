package nowcoder.practice.offer2;

public class Solution23 {
	public ListNode EntryNodeOfLoop(ListNode pHead)
    {
		ListNode p = pHead;
		p.val = 1;
		while(p.val == 1)
		{
			p = p.next;
			p.val = 1;
		}
		return p;
        
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
	}

}

class ListNode23 {
    int val;
    ListNode next = null;

    ListNode23(int val) {
        this.val = val;
    }
}
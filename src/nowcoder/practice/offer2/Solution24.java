package nowcoder.practice.offer2;

public class Solution24 {
	public ListNode ReverseList(ListNode head) {
		if(head == null || head.next == null)
		{
			return head;
		}
		
		ListNode p1 = head;
		ListNode p2 = p1.next;
		ListNode p3 = p2.next;
		
		p1.next = null;
		//p2.next = p1;
		//p1.next = null;
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

class ListNode24 {
    int val;
    ListNode next = null;

    ListNode24(int val) {
        this.val = val;
    }
}
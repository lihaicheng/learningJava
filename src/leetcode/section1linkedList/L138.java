package leetcode.section1linkedList;

public class L138 {
	public static RandomListNode copyRandomList(RandomListNode head) {
		if(head == null)
		{
			return head;
		}
		RandomListNode p1 = head;
		while(p1 != null)
		{
			RandomListNode p2 = new RandomListNode(p1.label);
			p2.next = p1.next;
			p1.next = p2;
			p1 = p2.next;
		}
		p1 = head;
		RandomListNode p2 = p1.next;
		while(p1 != null)
		{
			p2.random = p1.random == null ? null : p1.random.next;
			p1 = p2.next;
			p2 = (p1 == null ? null : p1.next);
		}
		p1 = head;
		p2 = head.next;
		RandomListNode newHead = head.next;
		while(p1 != null)
		{
			p1.next = p2.next;
			p1 = p1.next;
			p2.next = p1 == null ? null : p1.next;
			p2 = p2.next;
		}
		
		return newHead;
	}
	public static void show(RandomListNode head) {
		while (head != null) {
			System.out.println(head.label);
			head = head.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomListNode n1 = new RandomListNode(1);
		RandomListNode n2 = new RandomListNode(2);
		RandomListNode n3 = new RandomListNode(3);
		RandomListNode n4 = new RandomListNode(4);
		RandomListNode n5 = new RandomListNode(5);

		n1.next = n2;
		n1.random = n3;
		n2.next = n3;
		n2.random = n4;
		n3.next = n4;
		n3.random = n5;
		n4.next = n5;
		n4.random = n1;
		n5.next = null;
		n5.random = n2;
		
		show(copyRandomList(n1));
	}

}

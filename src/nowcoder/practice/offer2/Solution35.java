package nowcoder.practice.offer2;

public class Solution35 {
	public RandomListNode Clone(RandomListNode pHead)
    {
		if(pHead == null)
		{
			return null;
		}
		RandomListNode temp = pHead.next;
		RandomListNode head = new RandomListNode(pHead.label);
		RandomListNode p1 = head;
		while(temp != null)
		{
			RandomListNode p2 = new RandomListNode(temp.label);
			p1.next = p2;
			p1 = p2;
			temp = temp.next;
		}
		p1 = head;
		RandomListNode p2 = head;
		RandomListNode p3 = pHead;
		RandomListNode p4 = pHead;
		while(p1 != null)
		{
			while(p4 != p3.random)
			{
				p4 = p4.next;
				p2 = p2.next;
			}
			p1.random = p2;
			p4 = pHead;
			p2 = head;
			p3 = p3.next;
			p1 = p1.next;
		}
		return head;        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

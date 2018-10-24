package nowcoder.practice.offer2;

import java.util.ArrayList;

public class Solution25 {
	public static ListNode Merge(ListNode list1,ListNode list2) {
		if(list1 == null)
		{
			return list2;
		}
		if(list2 == null)
		{
			return list1;
		}
        ListNode p1 = list1;
        ListNode p1_1 = list1;
        ListNode p2 = list2;
        ListNode p2_1 = list2;
        ListNode head = null;
        if(p1.val <= p2.val )
        {
            head = p1;
        }else if(p1.val > p2.val )
        {
            head = p2;
        }
        while(p1 != null && p2 != null)
        {
            if(p1.val <= p2.val)
            {
                p1_1 = p1.next;
                p1.next = p2;
                p1 = p1_1;
            }else if(p1.val > p2.val)
            {
                p2_1 = p2.next;
                p2.next = p1;
                p2 = p2_1;
            }
        }
        return head;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ListNode n0 = new ListNode(0);
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		ListNode n6 = new ListNode(6);
		//n0.next = n1;
		n1.next = n3;
		n3.next = n5;
		
		n2.next = n4;
		n4.next = n6;
		ArrayList<Integer> ai = Solution6.printListFromTailToHead(Merge(n1, n2));
		//ArrayList<Integer> ai = new ArrayList<>();
		System.out.println(ai);
	}

}

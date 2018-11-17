package nowcoder.practice.offer.section3_4;

public class O23 {
    public static ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if (pHead == null)
        {
            return null;
        }
        ListNode quick = pHead;
        ListNode slow = pHead;

        while (quick != null && quick.next != null)
        {
            quick = quick.next.next;
            slow = slow.next;
            if (quick == slow)
            {
                quick = pHead;
                while (quick != slow)
                {
                    quick = quick.next;
                    slow = slow.next;
                }
                return quick;
            }
        }
        return null;

    }
    public static ListNode init()
    {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l3;
        return l1;
    }

    public static void main(String[] args) {
        ListNode pHead = init();
        ListNode enter = EntryNodeOfLoop(pHead);
        System.out.print(enter.val);

    }
}

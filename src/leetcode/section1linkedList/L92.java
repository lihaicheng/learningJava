package leetcode.section1linkedList;

public class L92 {
	public static ListNode reverseBetween(ListNode head, int m, int n) {
		if(head == null || head.next == null)
		{
			return head;
		}
		
		int change_len = n - m + 1;//需要逆置结点个数
		ListNode pre_head = null;//初始化开始逆置结点的前驱
		ListNode result = head;//最终转换后的链表头节点，非特殊情况即为head，特殊情况，m=1
		ListNode next = null;
		while(head != null && (--m) != 0)
		{
			//1
			pre_head = head;
			
			head = head.next;
		}
		ListNode reverse_head = head;
		ListNode new_head = null;
		
		while(head != null && change_len != 0)
		{
			next = head.next;
			head.next = new_head;
			new_head = head;
			head = next;
			change_len--;
			
		}
		
		
		
		/*ListNode p_m_1 = null;//用于指向m-1的位置
		ListNode temp_p = null;//用于指向中间的位置，因为删除指向的时候会找不到，指向前驱
		ListNode temp = null;//用于指向中间的位置，因为删除指向的时候会找不到
		ListNode temp_b = null;//用于指向中间的位置，因为删除指向的时候会找不到，指向后继
		//ListNode p_nAdd1 = null;//用于指向n+1的位置
		
		if(m == 1)
		{
			
		}
		else
		{
			p_m_1 = head;
			for(int i = 2 ; i < m ; i++)
			{
				p_m_1 = p_m_1.next;
			}
			//定位到改变指针的前驱和后继
			temp_p = p_m_1;
			temp = temp_p.next;
			temp_b = temp.next;
			for(int i = m ; i <= n ; i ++)
			{
				//改变指针的指向
				temp.next = temp_p;
				
				//顺移
				temp_p = temp;
				temp = temp_b;
				temp_b = temp.next;
			}
			System.out.println(temp_b.val);
			System.out.println(temp.val);
			p_m_1.next.next = temp_b;
			p_m_1.next = temp;
		}*/
		
		return head;
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

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = null;
		int m = 2;
		int n = 4;

		show(n1);
		System.out.println("==========");

		ListNode newHead = reverseBetween(n1 , m , n);

		show(newHead);
	}

}

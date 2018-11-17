package nowcoder.practice.offer2;

public class Solution8 {
	/*public static TreeLinkNode GetNext(TreeLinkNode pNode) {
		
		// 如果pNode结点有右子节点，返回右子树的最左子结点
		if (pNode.right != null) {
			
			return GetLeftSon(pNode.right);
		}
		
		// 如果pNode结点没有右子节点
		else
		{
			
			//如果这个结点是其父节点的左子，其父节点就是下一个结点
			if(pNode.next.left == pNode)
			{
				return pNode.next;
			}
			//如果这个结点是其父节点的右子，那么下一个结点是父节点中第一个是其父节点的父节点的左子的父节点
			else
			{
				return (GetLeftFather(pNode.next) == null)?null:GetLeftFather(pNode.next);
			}
		}
	}

	public static TreeLinkNode GetLeftSon(TreeLinkNode pNode) {
		TreeLinkNode sonNode = pNode;
		while (sonNode.left != null) {
			sonNode = sonNode.left;
		}
		return sonNode;
	}
	public static TreeLinkNode GetLeftFather(TreeLinkNode pNode) {
		TreeLinkNode fatherNode = pNode;
		if(fatherNode.next == null)
		{
			return null;
		}
		else 
		{
			while (fatherNode.next.left != fatherNode) {
				fatherNode = fatherNode.next;
				if(fatherNode.next == null)
				{
					return null;
				}
			}
		}
		
		return fatherNode.next;
	}*/
	
	public static TreeLinkNode GetNext(TreeLinkNode pNode) {
		
		return pNode;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeLinkNode node0 = new TreeLinkNode(0);
		TreeLinkNode node1 = new TreeLinkNode(1);
		TreeLinkNode node2 = new TreeLinkNode(2);
		TreeLinkNode node3 = new TreeLinkNode(3);
		TreeLinkNode node4 = new TreeLinkNode(4);
		//TreeLinkNode node5 = new TreeLinkNode(5);
		/*node0.left = node1;
		node0.right = node2;
		node0.next = null;
		
		node1.left = null;
		node1.right = node3;
		node1.next = node0;
		
		node2.left = node4;
		node2.right = node5;
		node2.next = node0;
		
		node3.left = null;
		node3.right = null;
		node3.next = node1;
		
		node4.left = null;
		node4.right = null;
		node4.next = node2;
		node5.left = null;
		node5.right = null;
		node5.next = node2;*/
		
		node0.left = node1;
		node1.left = node2;
		node2.left = node3;
		node3.left = node4;
		
		TreeLinkNode testnode = node0;
		System.out.println(GetNext(testnode) == null ? "null" : GetNext(testnode).val);
		testnode = node1;
		System.out.println(GetNext(testnode) == null ? "null" : GetNext(testnode).val);
		testnode = node2;
		System.out.println(GetNext(testnode) == null ? "null" : GetNext(testnode).val);
		testnode = node3;
		System.out.println(GetNext(testnode) == null ? "null" : GetNext(testnode).val);
		testnode = node4;
		System.out.println(GetNext(testnode) == null ? "null" : GetNext(testnode).val);
		//testnode = node5;
		//System.out.println(GetNext(testnode) == null ? "null" : GetNext(testnode).val);
		
	}

}

class TreeLinkNode {
	int val;
	TreeLinkNode left = null;
	TreeLinkNode right = null;
	TreeLinkNode next = null;

	TreeLinkNode(int val) {
		this.val = val;
	}
}
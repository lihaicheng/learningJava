package nowcoder.practice.offer2;

public class Solution36 {
	public static TreeNode Convert(TreeNode pRootOfTree) {
		if(pRootOfTree == null)
		{
			return null;
		}
		TreeNode head = DeepestLeftSon(pRootOfTree);
		press(pRootOfTree);
		return head;
	}
	public static void press(TreeNode root)
	{
		TreeNode pleft = DeepestRightSon(root.left);
		TreeNode pright = DeepestLeftSon(root.right);
		if(root.left != null)
		{
			press(root.left);
		}
		if(root.right != null)
		{
			press(root.right);
		}
		
		root.left = pleft;
		if(pleft != null)
		{
			pleft.right = root;
		}
		
		
		root.right = pright;
		if(pright != null)
		{
			pright.left = root;
		}
		
	}
	public static TreeNode DeepestRightSon(TreeNode root)
	{
		if(root == null)
		{
			return null;
		}
		TreeNode p = root;
		while(null != p.right)
		{
			p = p.right;
		}
		return p;
		
	}
	public static TreeNode DeepestLeftSon(TreeNode root)
	{
		if(root == null)
		{
			return null;
		}
		TreeNode p = root;
		while(null != p.left)
		{
			p = p.left;
		}
		return p;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] pre = {1,2,4,7,3,5,6,8};
		int[] in = {4,7,2,1,5,3,8,6};
		try {
			TreeNode root = Solution7.reConstructBinaryTree(pre,in);
			Solution7.preorder(root);
			Convert(root);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	

}

/*class TreeNode {
	int val = 0;
	TreeNode left = null;
	TreeNode right = null;

	public TreeNode(int val) {
		this.val = val;

	}

}*/
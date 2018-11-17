package nowcoder.practice.offer2;

import java.util.ArrayList;

public class Solution55 {
	public static int TreeDepth(TreeNode root) {
		if(root == null)
		{
			return 0;
		}
		ArrayList<TreeNode> at = new ArrayList<>();
		at.add(root);
		int deep = 1;//深度
		int end = 0;//结束位
		int newend = end;
		int start = 0;//起始位
		
		TreeNode p = null;
		while(null != (p = at.get(start)))
		{
			if(p.left != null)
			{
				at.add(p.left);
				newend++;
			}
			if(p.right != null)
			{
				at.add(p.right);
				newend++;
			}
			if(start < end)
			{
				start++;
			}
			else
			{
				if(newend > end)
				{
					deep++;
					end = newend;
				}
				if(start < end)
				{
					start++;
				}
				else
				{
					break;
				}
			}
			
		}
		
		
		
		return deep;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.right = new TreeNode(3);
		System.out.println(TreeDepth(root));
	}

}

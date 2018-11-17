package nowcoder.practice.offer2;

import java.util.ArrayList;

public class Solution32 {
	public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		
		ArrayList<Integer> ai = new ArrayList<Integer>();
		if(root == null)
		{
			return ai;
		}
		ArrayList<TreeNode> at = new ArrayList<>();
		at.add(root);
		TreeNode temp = null;
		while(!at.isEmpty())
		{
			temp = at.remove(0);
			ai.add(temp.val);
			if(temp.left != null)
			{
				at.add(temp.left);
			}
			if(temp.right != null)
			{
				at.add(temp.right);
			}
		}
		return ai;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(10);
		System.out.println(PrintFromTopToBottom(root));
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
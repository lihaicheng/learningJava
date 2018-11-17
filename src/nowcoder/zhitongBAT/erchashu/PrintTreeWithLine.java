package nowcoder.zhitongBAT.erchashu;

import java.util.ArrayList;

public class PrintTreeWithLine {
	public static void printTree(TreeNode root)
	{
		ArrayList<TreeNode> at = new ArrayList<>();
		at.add(root);
		TreeNode last = root;
		TreeNode nlast = null;
		TreeNode temp = null;
		while(!at.isEmpty())
		{
			temp = at.remove(0);
			System.out.print(temp.val + " ");
			if(temp.left != null)
			{
				at.add(temp.left);
				nlast = temp.left;
			}
			if(temp.right != null)
			{
				at.add(temp.right);
				nlast = temp.right;
			}
			if(temp == last)
			{
				System.out.println();
				last = nlast;
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);
		TreeNode n7 = new TreeNode(7);
		TreeNode n8 = new TreeNode(8);
		
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n3.left = n5;
		n3.right = n6;
		n5.left = n7;
		n5.right = n8;
		
		printTree(n1);
		

	}

}

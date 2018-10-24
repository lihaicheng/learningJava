package nowcoder.practice.offer2;

import java.util.ArrayList;

public class Solution54 {
	public static TreeNode KthNode(TreeNode pRoot, int k)
    {
		if(k < 1 || pRoot == null)
		{
			return null;
		}
		ArrayList<TreeNode> ai = new ArrayList<>();
		visitin(pRoot,ai);
		if(k > ai.size())
		{
			return null;
		}
		return ai.get(k-1);
        
    }
	public static void visitin(TreeNode pRoot,ArrayList<TreeNode> ai)
	{
		if(pRoot.left != null)
		{
			visitin(pRoot.left, ai);
		}
		
		ai.add(pRoot);
		
		if(pRoot.right != null)
		{
			visitin(pRoot.right, ai);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

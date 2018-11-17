package nowcoder.practice.offer2;

public class Solution28 {
	public void Mirror(TreeNode root) {
		if(root == null)
		{
			return;
		}
		TreeNode ptemp = root.left;
		root.left = root.right;
		root.right = ptemp;
		//if (root.left != null) {
			Mirror(root.left);
		//}
		//if (root.right != null) {
			Mirror(root.right);
		//}

	}
	boolean isSymmetrical(TreeNode pRoot)
    {
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
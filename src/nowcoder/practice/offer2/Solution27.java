package nowcoder.practice.offer2;

public class Solution27 {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


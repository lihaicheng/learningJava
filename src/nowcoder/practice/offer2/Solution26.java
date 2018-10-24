package nowcoder.practice.offer2;

public class Solution26 {
	public boolean HasSubtree(TreeNode root1, TreeNode root2) {
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode node0 = new TreeNode(0);
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		node0.left = node1;
		node0.right = node2;
		node1.right = node3;
		node2.left = node4;

	}

}

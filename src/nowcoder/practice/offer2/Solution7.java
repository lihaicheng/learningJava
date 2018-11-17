package nowcoder.practice.offer2;

public class Solution7 {
	public static TreeNode reConstructBinaryTree(int[] pre, int[] in) throws Exception {
		if (pre == null || in == null || pre.length <= 0 || in.length <= 0 || pre.length != in.length)// 输入非法
		{
			return null;
		} else {
			return ConstructCore(pre, in, 0, pre.length - 1, 0, in.length - 1);
		}
	}
	public static TreeNode ConstructCore(int[] pre, int[] in, int startpre, int endpre, int startin, int endin)
			throws Exception {
		TreeNode root = new TreeNode(pre[startpre]);
		int index = 0;
		for(; index <= endin ; index ++)
		{
			if(in[index] == pre[startpre])
			{
				break;
			}
		}
		System.out.println(index);
		int spl = startpre + 1;
		int epl = startpre + index;
		int sil = startin;
		int eil = index - 1;
		
		int spr = epl + 1;
		int epr = endpre;
		int sir = index + 1;
		int eir = endin;
		if(spl > epl)
		{
			root.left = null;		
		}
		else 
		{
			root.left = ConstructCore(pre, in, spl, epl, sil, eil);
		}
		if(true)
		{
			root.right = null;
			
		}
		else 
		{
			root.right = ConstructCore(pre, in, spr, epr, sir, eir);
		}
		return root;
	}

	/*public static TreeNode ConstructCore(int[] pre, int[] in, int startpre, int endpre, int startin, int endin)
			throws Exception {
		// 建立root结点，最终要返回的就是这个结点
		int rootval = pre[startpre];
		TreeNode root = new TreeNode(rootval);
		root.left = root.right = null;
		// 如果这是叶子节点，这时候就可以返回了
		if (startpre == endpre) {
			if ((startin == endin) && (pre[startpre] == in[startin])) {
				return root;
			} else {
				throw new Exception("invalid input");
			}
		}
		// 寻找中序中的根节点，indexrootin最终就是根节点的位置
		int indexrootin = startin;
		while (indexrootin <= endin && in[indexrootin] != rootval) {
			indexrootin++;
		}
		if (indexrootin == endin && in[indexrootin] != rootval) {
			throw new Exception("invalid input");
		}
		// 现在确定左子树的长度
		int leftlength = indexrootin - startin;
		// 现在确定右子树的长度
		int rightlength = endin - indexrootin;

		// 现在要确定左子树的下标
		int leftsonstartpre = startpre + 1;
		int leftsonendpre = startpre + leftlength;
		int leftsonstartin = startin;
		int leftsonendin = indexrootin - 1;
		// 现在确定右子树的下标
		int rightsonstartpre = leftsonendpre + 1;
		int rightsonendpre = endpre;
		int rightsonstartin = indexrootin + 1;
		int rightsonendin = endin;
		// 如果有左子，递归的返回左子
		if (leftlength != 0) {
			root.left = ConstructCore(pre, in, leftsonstartpre, leftsonendpre, leftsonstartin, leftsonendin);
		}
		// 如果右子树不为空，则该结点递归调用ConstructCore算出
		if (rightlength != 0) {
			root.right = ConstructCore(pre, in, rightsonstartpre, rightsonendpre, rightsonstartin, rightsonendin);
		}
		return root;
	}*/

	public static void preorder(TreeNode node) {
		if (node != null) {
			visit(node);
			preorder(node.left);
			preorder(node.right);
		}
	}

	public static void visit(TreeNode node) {
		System.out.println(node.val);
	}
	/*public static TreeNode reConstructBinaryTree(int[] pre, int[] in) throws Exception {
		TreeNode root = new TreeNode(pre[0]);
		root.left = buildTree();
		return root;
	}
	public static TreeNode buildTree(int[] pre, int[] in , int spl , int epl ) throws Exception {
		return null;
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*TreeNode node0 = new TreeNode(0);
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		node0.left = node1;
		node0.right = node2;
		node1.right = node3;
		node2.left = node4;
		preorder(node0);*/
		int[] pre = {1,2,4,7,3,5,6,8};
		int[] in = {4,7,2,1,5,3,8,6};
		try {
			TreeNode root = reConstructBinaryTree(pre,in);
			preorder(root);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

/*class TreeNode7 {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}*/
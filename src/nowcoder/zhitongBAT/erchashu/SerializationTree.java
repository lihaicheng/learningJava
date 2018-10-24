package nowcoder.zhitongBAT.erchashu;

public class SerializationTree {
	// 先序序列化
	public static int index = -1;
	public static String serialization(TreeNode root) {
		StringBuilder sb = new StringBuilder();
		serializationCore(sb, root);
		return sb.toString();
	}

	public static void serializationCore(StringBuilder sb, TreeNode root) {
		if (root == null) {
			sb.append("#!");
			return;
		}
		sb.append(root.val + "!");
		serializationCore(sb, root.left);
		serializationCore(sb, root.right);
	}

	public static TreeNode deserialization(String s) {
		index++;
		String[] strr = s.split("!");
		TreeNode node = null;
		if (!strr[index].equals("#")) {
			node = new TreeNode(Integer.valueOf(strr[index]));
			node.left = deserialization(s);
			node.right = deserialization(s);
		}
		return node;

	}

	public static void deserializationCore(String[] values, int[] l, TreeNode root) {
		
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

		String s = serialization(deserialization("1!2!4!#!#!#!3!5!7!#!#!8!#!#!6!#!#!"));
		System.out.println(s);
	}

}

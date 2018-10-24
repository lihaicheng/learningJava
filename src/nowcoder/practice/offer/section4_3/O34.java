package nowcoder.practice.offer.section4_3;

import java.util.ArrayList;

public class O34 {
    public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null)
        {
            return null;
        }
        
        return null;
    }

    public static TreeNode init()
    {
        TreeNode a = new TreeNode(10);
        TreeNode b = new TreeNode(5);
        TreeNode c = new TreeNode(12);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(7);


        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;

        return a;
    }

    public static void main(String[] args) {
        TreeNode root = init();
        int target = 22;
        ArrayList<ArrayList<Integer>> aai = FindPath(root, target);
        System.out.print(aai);

    }

}

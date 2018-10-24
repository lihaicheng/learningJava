package leetcode.section10ds;

public class Demo1 {
    public static void pre_order_trie(TrieNode root, int layer)
    {

        for (int i = 0 ; i < TrieNode.char_num ; i++)
        {
            if (root.child[i] != null)
            {
                for (int j = 0 ; j < layer ; j++)
                {
                    System.out.print("---");
                }
                System.out.print((char)(i + 'a'));
                if (root.child[i].is_end)
                {
                    System.out.print("<end>");
                }
                System.out.println();
                pre_order_trie(root.child[i], layer+1);
            }
        }
    }

    public static void main(String[] args) {
        TrieNode root = Init.init();
        pre_order_trie(root, 0);
    }
}


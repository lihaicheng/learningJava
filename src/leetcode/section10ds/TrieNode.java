package leetcode.section10ds;

public class TrieNode {
    public static final int char_num = 26;
    public TrieNode[] child = new TrieNode[char_num];
    public boolean is_end = false;
    public TrieNode()
    {
        for (int i = 0 ; i < char_num ; i++)
        {
            child[i] = null;
        }
    }
}

package leetcode.section10ds;

public class Init {
    public static TrieNode init()
    {
        TrieNode root = new TrieNode();
        TrieNode n1 = new TrieNode();
        TrieNode n2 = new TrieNode();
        TrieNode n3 = new TrieNode();

        root.child['a' - 'a'] = n1;
        root.child['b' - 'a'] = n2;
        root.child['e' - 'a'] = n3;
        n2.is_end = true;


        TrieNode n4 = new TrieNode();
        TrieNode n5 = new TrieNode();
        TrieNode n6 = new TrieNode();

        n1.child['b' - 'a'] = n4;
        n2.child['c' - 'a'] = n5;
        n3.child['f' - 'a'] = n6;

        TrieNode n7 = new TrieNode();
        TrieNode n8 = new TrieNode();
        TrieNode n9 = new TrieNode();
        TrieNode n10 = new TrieNode();

        n4.child['c' - 'a'] = n7;
        n4.child['d' - 'a'] = n8;
        n5.child['d' - 'a'] = n9;
        n6.child['g' - 'a'] = n10;

        n7.is_end = true;
        n8.is_end = true;
        n9.is_end = true;
        n10.is_end = true;

        TrieNode n11 = new TrieNode();

        n7.child['d' - 'a'] = n11;
        n11.is_end = true;

        return root;
    }
}

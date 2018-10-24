package leetcode.section10ds;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
    public static void get_all_word_from_trie(TrieNode root, StringBuilder word, List<String> result)
    {

        for (int i = 0 ; i < TrieNode.char_num ; i++)
        {
            if (root.child[i] != null)
            {
                word.append((char)(i + 'a'));

                if (root.child[i].is_end)
                {
                    result.add(word.toString());
                }
                get_all_word_from_trie(root.child[i], word, result);
                word.deleteCharAt(word.length()-1);
            }
        }
    }

    public static void main(String[] args) {
        TrieNode root = Init.init();
        StringBuilder word = new StringBuilder();
        List<String> result = new ArrayList<>();
        get_all_word_from_trie(root, word, result);
        System.out.print(result);

    }
}

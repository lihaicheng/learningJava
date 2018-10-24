package nowcoder.exam.tusimple0921;

import java.util.HashMap;
import java.util.LinkedList;

public class Main1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LFUCache l = new LFUCache(1);
		l.set(1, "a");
		System.out.println(l.get(1));
		l.set(2, "b");
		System.out.println(l.get(1));
	}

}

class LFUCache
{
	public int keyNum = 0;
	public static Node head = null;
    public static Node end = null;
	public static HashMap<Integer, Node> cacheMap = null;
    public static LinkedList<Node> cacheList = null;
    public static int len = 0;
	public LFUCache(int keyNum)
	{
		this.keyNum = keyNum;
        cacheMap = new HashMap<>();
        cacheList = new LinkedList<>();
	}
	public String get(int key)
	{
		if (cacheMap.containsKey(key))
        {
            Node temp = cacheMap.get(key);
            Node p = temp.pre;//??null
            Node n = temp.next;//??null
            if (p != null)
            {
                p.next = n;
            }
            if (n != null)
            {
                n.pre = p;
            }
            temp.pre = end;
            temp.next = null;
            return temp.value;
        }
        else
        {
            return "-1";
        }
	}
	public void set(int key, String value)
	{
        if (head == null)
        {
            Node node = new Node(key, value);
            this.cacheMap.put(key, node);
            head = node;
            end = node;
            len++;
        }
        else
        {
            Node node = new Node(key, value);
            cacheMap.put(key, node);
            end.next = node;
            node.pre = end;
            end = node;
            len++;
            if (len > this.keyNum)
            {
            	cacheMap.remove(head.key);
                head = head.next;
                head.pre = null;
                
                len--;
            }
        }
	}
}

class Node
{
	public int key = 0;
	public String value = "";
    public Node pre = null;
	public Node next = null;
	public Node(int key, String value)
	{
		this.key = key;
		this.value = value;
	}
}
package nowcoder.practice.offer.section2_3;

public class O8 {
    public static TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if (pNode == null)
        {
            return null;
        }
        if (pNode.right != null)
        {
            TreeLinkNode next = pNode.right;
            while (next.left != null)
            {
                next = next.left;
            }
            return next;
        }
        else
        {
            if (pNode.next == null)
            {
                return null;
            }
            else
            {
                TreeLinkNode next = pNode.next;
                if (next.left == pNode)
                {
                    return pNode.next;
                }
                if (next.right == pNode)
                {
                    while (next.next != null)
                    {
                        if (next.next.left == next)
                        {
                            return next.next;
                        }
                        else
                        {
                            next = next.next;
                        }
                    }
                    return null;
                }
            }
        }
        return null;
    }
    public static TreeLinkNode getNode()
    {
        TreeLinkNode a = new TreeLinkNode("a");
        TreeLinkNode b = new TreeLinkNode("b");
        TreeLinkNode c = new TreeLinkNode("c");
        TreeLinkNode d = new TreeLinkNode("d");
        TreeLinkNode e = new TreeLinkNode("e");
        TreeLinkNode f = new TreeLinkNode("f");
        TreeLinkNode g = new TreeLinkNode("g");
        TreeLinkNode h = new TreeLinkNode("h");
        TreeLinkNode i = new TreeLinkNode("i");

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        b.next = a;
        c.left = f;
        c.right = g;
        c.next = a;
        d.next = b;
        e.left = h;
        e.right = i;
        e.next = b;
        f.next = c;
        g.next = c;
        h.next = e;
        i.next = e;

        return f;

    }
    public static void main(String[] args) {
        TreeLinkNode node = getNode();
        TreeLinkNode next = GetNext(node);
        if (next == null)
        {
            System.out.print("null");
        }
        else
        {
            System.out.print(next.val);
        }

    }

}

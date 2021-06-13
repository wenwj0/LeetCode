package tree;

import java.util.*;

public class S236_LowestCommonAncestorOfABinaryTree {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(3);
        TreeNode b = new TreeNode(5);
        TreeNode c = new TreeNode(1);
        TreeNode d = new TreeNode(6);
        TreeNode f = new TreeNode(2);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = f;

        S236_LowestCommonAncestorOfABinaryTree test = new S236_LowestCommonAncestorOfABinaryTree();
        TreeNode result = test.lowestCommonAncestor(a,b,c);
    }
    Map<TreeNode, TreeNode> map;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        map = new HashMap<>();
        Set<TreeNode> set = new HashSet<>();
        preSearch(root);
        while (p != root) {
            set.add(p);
            p = map.get(p);
        }
        while (q != root) {
            if (set.contains(q)) {
                return q;
            }
            q = map.get(q);
        }
        return q;
    }

    public void preSearch(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            map.put(root.left, root);
            preSearch(root.left);
        }
        if (root.right != null) {
            map.put(root.right, root);
            preSearch(root.right);
        }
    }
}

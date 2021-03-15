package tree;

import java.util.*;

public class S114_FlattenBinaryTreeToLinkedList {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        a.left = b;
        a.right = e;
        b.left = c;
        b.right = d;
        e.right = f;
        S114_FlattenBinaryTreeToLinkedList s = new S114_FlattenBinaryTreeToLinkedList();
        s.flatten(a);
    }

    public void flatten(TreeNode root) {
        if (root==null || root.left==null)
            return;
        Stack<TreeNode> stack = new Stack<>();
        while(!stack.isEmpty() || root!=null){
            while(root!=null){
                stack.push(root.left);
                root = root.left;
            }
            root = stack.pop();
            stack.push(root.right);
        }
    }

    public TreeNode build(TreeNode root) {
        if (root != null && root.left != null) {
            root.left = build(root.left);
            while(root.right!=null)
                root = root.right;
            root.right =  build(root.right);
            root.left = null;
        }
        return root;
    }

    public void flatten0(TreeNode root) {
        List<Integer> list = getNodes(root);
        if (list.size() <= 0)
            return;
        root.left = null;
        root.right = null;
        TreeNode p = root;
        for (int i = 1; i < list.size(); i++) {
            TreeNode treeNode = new TreeNode(list.get(i));
            p.right = treeNode;
            p = p.right;
        }
    }

    public List<Integer> getNodes(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                res.add(root.val);
                stack.add(root);
                root = root.left;
            }
            root = stack.pop();
            root = root.right;
        }
        return res;
    }
}

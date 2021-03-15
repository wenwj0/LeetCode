package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class S098_ValidateBinarySearchTree {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(5);
        TreeNode b = new TreeNode(1);
        TreeNode c = new TreeNode(3);
        a.left = b;
        a.right = c;
        S098_ValidateBinarySearchTree s098_validateBinarySearchTree = new S098_ValidateBinarySearchTree();
        s098_validateBinarySearchTree.isValidBST(a);
    }
    public boolean isValidBST(TreeNode root) {
        long left = Long.MIN_VALUE;
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.val <= left)
                return false;
            left = root.val;
            root = root.right;
        }
        return true;
    }

    public boolean isValidBST0(TreeNode root) {
        long lower = Long.MIN_VALUE;
        long upper = Long.MAX_VALUE;
        return helper(root, lower, upper);
    }

    public boolean helper(TreeNode root, long lower, long upper) {
        if (root == null)
            return true;
        if (root.left != null) {
            if (root.left.val <= lower || root.left.val >= root.val)
                return false;
        }
        if (root.right != null) {
            if (root.right.val <= root.val || root.right.val >= upper)
                return false;
        }
        return helper(root.left, lower, root.val) && helper(root.right, root.val, upper);
    }
}
// [5,4,6,null,null,3,7]
//[-2147483648,null,2147483647]
package tree;

import java.util.LinkedList;
import java.util.Queue;

public class S101_SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        return check(root.left,root.right);
    }
    public boolean check(TreeNode left,TreeNode right){
        if(left==null && right==null)
            return true;
        if(left==null || right==null)
            return false;
        return left.val==right.val && check(left.left, right.right) && check(left.right,right.left);
    }
}

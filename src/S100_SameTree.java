package src;

public class S100_SameTree {
    public boolean isSameTree(tree.TreeNode p, TreeNode q) {
        if(p==null && q == null)
            return true;
        if(p==null || q== null)
            return false;
        if(p.val!=q.val)
            return false;
        else
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}

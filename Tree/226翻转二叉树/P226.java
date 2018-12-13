package leetcodeTest;

import java.util.Stack;

public class P226 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1==null && t2==null)
        	return null;
        Stack<TreeNode> a = new Stack<>();
        Stack<TreeNode> b = new Stack<>();
        a.push(t1);
        b.push(t2);
        while(!a.isEmpty() && !b.isEmpty()) {
        	TreeNode tt1 = a.pop();
        	TreeNode tt2 = b.pop();
        	tt1.val += tt2.val;
        	if(tt1.left==null && tt2.left!=null) {
        		TreeNode temp = new TreeNode(tt2.left.val);
        		tt1.left = temp;
        		a.push(temp);
        	}
        	if(tt1.left!=null) {
        		if(tt2.left==null) {
        			a.push(tt1.left);
        		}else {
        			tt1.left.val += tt2.left.val;
        			
        		}  			
        		
        	}
        }
    
		return t1;
	}
}

package Tree;

import java.util.Stack;

public class P104DFS {
	public int maxDepth(TreeNode root) {
		if(root==null)
			return 0;
		Stack<TreeNode> stack = new Stack<>();
		Stack<Integer> value = new Stack<>();
		stack.push(root);
		Integer cnt = 1;
		value.push(cnt);
		while(!stack.isEmpty()) {
			TreeNode temp = stack.pop();
			int n = value.pop();
			cnt = Math.max(cnt, n);
			if(temp.left!=null) {
				stack.push(temp.left);
				value.push(cnt+1);
			}
			if(temp.right!=null) {
				stack.push(temp.right);
				value.push(cnt+1);
			}
		}
		return cnt;
	}
}

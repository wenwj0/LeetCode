package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class S104_MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }

    //BFS
    public int maxDepth0(TreeNode root) {
        if(root==null)
            return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int cnt = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            while(size-- >0) {
                TreeNode poll = queue.poll();
                if(poll.left!=null)
                    queue.add(poll.left);
                if(poll.right!=null)
                    queue.add(poll.right);
            }
            cnt++;
        }
        return cnt;
    }
    //DFS
    public int maxDepth1(TreeNode root) {
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

package tree;

import linkedList.ListNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class S107_BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrderBottom0(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null)
            return res;
        queue.offer(root);
        while (!queue.isEmpty()) {
            int layerNum = queue.size();
            List<Integer> temp = new LinkedList<>();
            for (int i = 0; i < layerNum; i++) {
                if (queue.peek().left != null)
                    queue.offer(root.left);
                if (queue.peek().right != null)
                    queue.offer(root.right);
                temp.add(queue.peek().val);
                queue.poll();
            }
            res.add(0, temp);
        }
        return res;
    }
}

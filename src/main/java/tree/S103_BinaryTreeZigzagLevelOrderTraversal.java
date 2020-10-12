package tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class S103_BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if (root == null)
            return res;
        Queue<TreeNode> queue = new LinkedList<>();
        boolean flag = false;
        queue.offer(root);
        while (!queue.isEmpty()) {
            flag = !flag;
            int size = queue.size();
            List<Integer> list = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
                if (flag)
                    list.add(node.val);
                else
                    list.add(0, node.val);
            }
            res.add(list);
        }
        return res;
    }

    public List<List<Integer>> zigzagLevelOrder0(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null)
            return res;
        queue.offer(root);
        boolean flag = true;
        while (!queue.isEmpty()) {
            int layerNum = queue.size();
            List<Integer> temp = new LinkedList<>();
            for (int i = 0; i < layerNum; i++) {
                if (flag == true)
                    temp.add(queue.peek().val);
                else
                    temp.add(0, queue.peek().val);
                if (queue.peek().left != null)
                    queue.offer(queue.peek().left);
                if (queue.peek().right != null)
                    queue.offer(queue.peek().right);
                queue.poll();
            }
            res.add(temp);
            flag = !flag;
        }
        return res;
    }
}

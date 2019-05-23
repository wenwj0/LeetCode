import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
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

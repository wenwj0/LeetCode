import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode-cn.com/problems/path-sum/solution/lu-jing-zong-he-by-leetcode-solution/
 */
public class S112_PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return sum == root.val;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

    public boolean hasPathSum0(TreeNode root, int sum) {
        if (root == null)
            return false;
        return search(root, sum - root.val);
    }

    public boolean search(TreeNode root, int sum) {
        if (sum < 0) return false;
        if (root.left == null && root.right == null) {
            if (sum == 0) return true;
            return false;
        } else if (root.left == null) {
            return search(root.right, sum - root.right.val);
        } else if (root.right == null) {
            return search(root.left, sum - root.left.val);
        } else {
            return search(root.left, sum - root.left.val) || search(root.right, sum - root.right.val);
        }
    }

    public boolean hasPathSum1(TreeNode root, int sum) {
        if (root == null) return false;
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> pathSum = new LinkedList<>();
        queue.add(root);
        pathSum.add(root.val);
        while (!queue.isEmpty()) {
            TreeNode head = queue.poll();
            int tempSum = pathSum.poll();
            if (head.left == null && head.right == null) {
                if (tempSum == sum)
                    return true;
                continue;
            }
            if (head.left != null) {
                queue.add(head.left);
                pathSum.add(tempSum + head.left.val);
            }
            if (head.right != null) {
                queue.add(head.right);
                pathSum.add(tempSum + head.right.val);
            }
        }
        return false;
    }
}

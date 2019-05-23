import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P102 {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> res = new LinkedList<>();
		if(root==null)
			return res;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			int layerNum = queue.size();
			List<Integer> sublist = new LinkedList<>();
			for(int i=0;i<layerNum;i++) {
				if(queue.peek().left!=null)
					queue.offer(queue.peek().left);
				if(queue.peek().right!=null)
					queue.offer(queue.peek().right);
				sublist.add(queue.peek().val);
			}
			queue.poll();
			res.add(sublist);
		}
		
		return res;
	}
}

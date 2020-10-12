package tree;

import java.util.HashMap;
import java.util.Map;

public class S106_ConstructBinaryTreeFromInorderAndPostorderTraversal {
	private Map<Integer,Integer> map = new HashMap<>();

	public TreeNode buildTree(int[] inorder, int[] postorder) {
		for(int i=0;i<inorder.length;i++){
			map.put(inorder[i],i);
		}
		TreeNode root = build(inorder,postorder,0,inorder.length-1,postorder.length-1);
		return root;
	}

	private TreeNode build(int[] inOrder, int[] postOrder,int inLeft,int inRight,int pRight) {
		if(inLeft>inRight || pRight<0)
			return null;
		TreeNode root = new TreeNode(postOrder[pRight]);
		int index = map.get(postOrder[pRight]);
		root.left = build(inOrder,postOrder,inLeft,index-1,pRight-inRight+index-1);
		root.right = build(inOrder,postOrder,index+1,inRight,pRight-1);
		return root;
	}
}

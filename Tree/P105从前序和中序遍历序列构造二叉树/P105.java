
public class P105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
    	TreeNode root = subTree(preorder, 0, inorder, 0, inorder.length-1);
    	return root;
    }
    private TreeNode subTree(int []preorder,int pleft,int[] inorder,int inleft,int inright){
    	if(inleft>inright||pleft>preorder.length-1)
    		return null;
    	TreeNode root = new TreeNode(preorder[pleft]);
    	int p = inleft;
    	for(int i=inleft;i<inright;i++) {
    		if(inorder[i]==preorder[pleft]) 
    			p=i;
    	}
    	root.left = subTree(preorder, pleft+1, inorder, inleft, p-1);
    	root.right = subTree(preorder, pleft+p-inleft+1, inorder, p+1, inright);
    	return root;
    }
}

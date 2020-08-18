import Tree.TreeNode;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class S104_MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
        return search(root,0);
    }
    public int search(TreeNode root,int depth){
        if(root==null)
            return depth;
        return Math.max(search(root.left,depth+1),search(root.right,depth+1));
    }

}
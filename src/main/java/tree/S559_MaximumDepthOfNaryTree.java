package tree;

import java.util.List;

public class S559_MaximumDepthOfNaryTree {
    public int maxDepth(Node root){
        if(root==null)
            return 0;
        List<Node> child = root.children;
        if(child==null || child.isEmpty())
            return 1;
        int max = -1;
        for(Node node : child){
            max = Math.max(max,maxDepth(node));
        }
        return max+1;
    }
}

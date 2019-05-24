package Tree;

import java.util.LinkedList;

public class P559 {
    public static int cnt = 0;
    public static int maxDepth(Node root){
        DFSearch(root,1);
        return cnt;
    }
    private static void DFSearch(Node root,int l){
        if(root==null){
            return;
        }else {
            cnt = Math.max(l,cnt);
            for(Node r:root.children){
                DFSearch(r,l+1);
            }
        }

    }

    public static void main(String[] args) {

        System.out.println(maxDepth(null));
    }
}

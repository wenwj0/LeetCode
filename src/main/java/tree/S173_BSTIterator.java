package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class S173_BSTIterator {
    public static void main(String[] args) {
        String s = new String("1");
        s.intern();
        String s2 = "1";
        System.out.println(s == s2);

        String s3 = new String("1") + new String("1");
        s3.intern();
        String s4 = "11";
        System.out.println(s3 == s4);
    }
    class BSTIterator {
        public List<Integer> list;
        public int pointer;

        public BSTIterator(TreeNode root) {
            pointer = 0;
            list = new ArrayList<>();
            inOrder(root);

        }

        public int next() {
            return list.get(pointer++);
        }

        public boolean hasNext() {
            return pointer < list.size() ? true:false;
        }

        public void inOrder(TreeNode root) {
            if (root == null)
                return;
            inOrder(root.left);
            list.add(root.val);
            inOrder(root.right);
        }
    }
}

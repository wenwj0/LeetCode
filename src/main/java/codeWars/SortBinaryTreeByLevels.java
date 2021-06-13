package codeWars;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class SortBinaryTreeByLevels {
    @Test
    public void basicTest() {
        assertEquals(Arrays.asList(1,2,3,4,5,6), SortBinaryTreeByLevels.treeByLevels(new Node(new Node(null, new Node(null, null, 4), 2), new Node(new Node(null, null, 5), new Node(null, null, 6), 3), 1)));
    }
    public static List<Integer> resultList;

    public static List<Integer> treeByLevels(Node node) {
        resultList = new ArrayList<>();
        if (node==null)
            return resultList;
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            Node head = queue.poll();
            resultList.add(head.value);
            if (head.left!=null)
                queue.add(head.left);
            if (head.right!=null)
                queue.add(head.right);
        }
        return resultList;
    }
}

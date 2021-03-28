import java.util.*;

public class S146_LRUCache {

    public static void main(String[] args) {
        S146_LRUCache s146_lruCache = new S146_LRUCache(2);
        s146_lruCache.put(1, 0);
        s146_lruCache.put(2, 2);
        s146_lruCache.get(1);
        s146_lruCache.put(3, 3);
        s146_lruCache.get(2);
        s146_lruCache.put(4, 4);
        s146_lruCache.get(1);
        s146_lruCache.get(3);
        s146_lruCache.get(4);
    }

    class Node {
        public Node pre;
        public Node next;
        public int key;
        public int val;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    public Node head;
    public Node tail;
    public int capacity;
    public int size;
    public Map<Integer, Node> map;

    public S146_LRUCache(int capacity) {
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.pre = head;
        this.capacity = capacity;
        this.size = 0;
        this.map = new HashMap<>();
    }

    public int get(int key) {
        Node n = map.get(key);
        if (n == null)
            return -1;
        remove(n);
        add(n);
        return n.val;
    }

    public void put(int key, int value) {
        Node n = map.get(key);
        if (n != null) {
            n.val = value;
            remove(n);
            add(n);
            return;
        }
        n = new Node(key, value);
        map.put(key, n);
        add(n);
        if (size < capacity) {
            size++;
        } else {
            map.remove(tail.pre.key);
            remove(tail.pre);
        }
    }

    public void add(Node node) {
        head.next.pre = node;
        node.next = head.next;
        head.next = node;
        node.pre = head;
    }

    public void remove(Node node) {
        node.next.pre = node.pre;
        node.pre.next = node.next;
    }
}

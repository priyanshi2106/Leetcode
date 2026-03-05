class LRUCache {
    int capacity;
    ListNode head;
    ListNode tail;
    HashMap<Integer,ListNode> hm ;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        hm = new HashMap<>();
        head = new ListNode(-1,-1);
        tail = new ListNode(-1,-1);
        head.next = tail;
        tail.prev = head;
        
    }
    
    public int get(int key) {
        if(hm.containsKey(key)){
            ListNode node = hm.get(key);
            remove(node);
            add(node);
            return node.value;

        }
        else{
            return -1;
        }
        
    }
    
    public void put(int key, int value) {
        if(hm.containsKey(key)){
            ListNode oldNode = hm.get(key);
            remove(oldNode);
        }
        ListNode newNode = new ListNode(key, value);
        add(newNode);
        //update hm
        hm.put(key, newNode);
        if(hm.size() > capacity){
            //delete node
            ListNode nodeToDelete = head.next;
            remove(nodeToDelete);
            hm.remove(nodeToDelete.key);
        }
        
    }
    public void add(ListNode node){
        ListNode prevEnd = tail.prev;
        prevEnd.next = node;
        node.prev = prevEnd;
        node.next = tail;
        tail.prev = node;
    }
    public void remove(ListNode node){
        node.prev.next = node.next;
        node.next.prev = node.prev;

    }
    public class ListNode{
        int key;
        int value;
        ListNode prev;
        ListNode next;
        public ListNode(int key, int value){
           this.key = key;
           this.value = value;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
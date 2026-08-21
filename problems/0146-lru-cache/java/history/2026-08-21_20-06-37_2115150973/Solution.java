class LRUCache {
    class Node{
        int val;
        int key;
        Node prev;
        Node next;

        Node(int key, int val){
            this.key = key;
            this.val = val;
        }
    }
    class DLL{
        Node head;
        Node tail;
        DLL(){
            head = new Node(0,0);
            tail = new Node(0,0);

            head.next = tail;
            tail.prev = head;
        }

        void insert(Node node){
            node.next = head.next;
            node.prev = head;
            head.next.prev = node;
            head.next = node;
        }

        void delete(Node node){
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
    }
    Map<Integer, Node> map;
    DLL list;
    int capacity;

    public LRUCache(int capacity) {
        map = new HashMap<>();
        list = new DLL();
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node temp = map.get(key);
            list.delete(temp);
            list.insert(temp);
            return temp.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node temp = map.get(key); // gives same Node object in the map.
            temp.val = value;
            list.delete(temp);
            list.insert(temp);
        }
        else{
            Node temp = new Node(key, value);
            list.insert(temp);
            map.put(key, temp);

            if(map.size() > capacity){
                Node lru = list.tail.prev;
                list.delete(lru);
                map.remove(lru.key);
            }
        }
    }
}

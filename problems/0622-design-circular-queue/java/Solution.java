class MyCircularQueue {
    int[] arr;
    int f, r, size;
    public MyCircularQueue(int k) {
        arr = new int[k];
        f = -1; r = -1; size = 0;
    }
    
    public boolean enQueue(int value) {
        if(size == arr.length) return false;
        if(size == 0){
            r = 0;
            f = 0;
            arr[0] = value;
        }
        else if(r < arr.length-1) arr[++r] = value;
        else if(r == arr.length-1){
            r = 0;
            arr[0] = value;
        }
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(size == 0) return false;
        if(f == arr.length-1) f = 0;
        else f++;
        size--;
        return true;
    }
    
    public int Front() {
        if(size == 0) return -1;
        return arr[f];
    }
    
    public int Rear() {
        if(size == 0) return -1;
        return arr[r];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == arr.length;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
class MyCircularQueue {
   private Queue<Integer> queue;
   private int last;
   private int size;
    public MyCircularQueue(int k) {
       queue=new ArrayBlockingQueue(k);
       size=k;
    }
    
    public boolean enQueue(int value) {
        try{
            queue.add(value);
            last=value;
            return true;
        }catch(IllegalStateException e){
            return false;
        }
    }
    
    public boolean deQueue() {
        if(queue.isEmpty())return false;
        queue.poll();
        return true;
    }
    
    public int Front() {
        if(queue.isEmpty())return -1;
        return queue.peek();
    }
    
    public int Rear() {
       if(queue.isEmpty())return -1;
       return last;
    }
    
    public boolean isEmpty() {
       return queue.size()==0;
    }
    
    public boolean isFull() {
        return queue.size()==size;
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
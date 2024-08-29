class MyStack {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public MyStack() {
      queue1 = new LinkedList<>();
      queue2 = new LinkedList<>();
    }
    
    public void push(int x) {
        queue1.offer(x);
    }
    
    public int pop() {
       while(queue1.size()>1) {
        queue2.offer(queue1.poll());
       }
       int top = queue1.poll();
       Queue<Integer> temp = queue1;
       temp = queue1;
       queue1= queue2;
       queue2= temp;
       return top;
    }
    
    public int top() {
      while(queue1.size()>1) {
        queue2.offer(queue1.poll());
       }
       int top = queue1.peek();
       queue2.offer(queue1.poll());

       Queue<Integer> temp = queue1;
       temp = queue1;
       queue1= queue2;
       queue2= temp;
       return top;
    }
    
    public boolean empty() {
       return queue1.isEmpty(); 
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
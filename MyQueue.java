class MyQueue{
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    
    public MyQueue(){
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    public void push(int val){
        stack1.push(val);
    }
    public int pop(){
        int temp;
        while(!stack1.empty()){
            stack2.push(stack1.pop());
        }
        temp = stack2.pop();
        while(!stack2.empty()){
            stack1.push(stack2.pop());
        }
        return temp;
    }
    public int peek(){
        int temp;
        while(!stack1.empty()){
            stack2.push(stack1.pop());
        }
        temp = stack2.peek();
        while(!stack2.empty()){
            stack1.push(stack2.pop());
        }
        return temp;
    }
    public boolean empty(){
        return stack1.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
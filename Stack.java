class Stack {
    private int maxSize;    
    private int[] stackArray;
    private int top;        
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }
    public void push(int value){
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
        }else {
            stackArray[++top] = value;
        }
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop");
            return -1;
        } else {
            return stackArray[top--];
        }
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek");
            return -1;
        } else {
            return stackArray[top];
        }
    }
    public boolean isEmpty() {
        return (top == -1);
    }
    public boolean isFull() {
        return (top == maxSize - 1);
    }
    public static void main(String[] args) {
        Stack stack = new Stack(5); 
        stack.push(10);  
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);  
        System.out.println("Top element is: " + stack.peek());  
        while (!stack.isEmpty()) {
            System.out.println("Popped element: " + stack.pop());  
        }
        System.out.println("Popped element from empty stack: " + stack.pop());  
    }
}

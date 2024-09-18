import java.util.Stack;

public class FindMaxAndMin {
   public Stack<Integer> mainstack = new Stack<>();
   public  Stack<Integer> maxstack = new Stack<>();
    public Stack<Integer> minstack = new Stack<>();
    public void push(int value){
        mainstack.push(value);
        if(maxstack.isEmpty() || value >=maxstack.peek()){
            maxstack.push(value);
        }else{
            maxstack.push(maxstack.peek());
        }
        if(minstack.isEmpty() || value<=minstack.peek()){
            minstack.push(value);
        }
        else{
            minstack.push(minstack.peek());
        }
    }
    public int getMax(){
        return maxstack.peek();
    }
    public int getMin(){
        return minstack.peek();
    }
    public static void main(String[] args) {
        FindMaxAndMin obj = new FindMaxAndMin();
        obj.push(2);
        obj.push(6);
        obj.push(9);
        obj.push(3);obj.push(3);
        System.out.println(obj.getMax());
        System.out.println(obj.getMin());

    }
}
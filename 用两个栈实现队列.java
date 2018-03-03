import java.util.Stack;

public class 用两个栈实现队列 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        if(stack2.isEmpty()){
            stack1.push(node);
        }else {
            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
            stack1.push(node);
        }
    }

    public int pop() {
        if(!stack2.isEmpty()){
            return stack2.pop();
        }else {
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            if(stack2.isEmpty()){
                return 0;
            }
            return stack2.pop();
        }
    }
}

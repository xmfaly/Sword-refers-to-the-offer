import java.util.Stack;

public class 栈的压入弹出序列 {

    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        int  k = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0;i<pushA.length;i++){
            if(pushA[i] == popA[k]){
                k++;
                while(!stack.isEmpty()){
                    if(stack.peek() == popA[k]){
                        k++;
                        stack.pop();
                    }else {
                        break;
                    }
                }
            }else {
                stack.push(pushA[i]);
            }
        }

        if(stack.isEmpty()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int [] pushA = {1,2,3,4,5};
        int [] popA = {4,3,5,2,1};
        System.out.println(IsPopOrder(pushA,popA));
    }
}

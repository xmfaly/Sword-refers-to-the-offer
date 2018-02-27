public class 斐波那契 {
    public int Fibonacci(int n) {
        if(n == 1 || n == 2){
            return 1;
        }
        int a = 1, b=1;
        int tem = 0;
        for(int i=3;i<=n;i++){
            tem = a + b;
            a = b;
            b = tem;
        }
        return tem;
    }
}

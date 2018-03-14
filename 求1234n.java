public class 求1234n {



    public static int Sum_Solution(int n) {
        int res = n;
        boolean temp = (n > 0) && (( res +=Sum_Solution(n-1))>0);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Sum_Solution(5));
    }
}

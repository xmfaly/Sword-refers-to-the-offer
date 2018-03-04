public class 整数中1出现的次数 {

    public static int NumberOf1Between1AndN_Solution(int n) {
        if(n == 0){
            return 0;
        }
        int ans = 0;
        int c= 0,k = 0;
        for(int i = 1 ;i<=n;i++){
            c = i;
            while(c!=0){
               if(c%10 == 1){
                   ans++;
               }
               c/=10;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(NumberOf1Between1AndN_Solution(0));
        System.out.println(NumberOf1Between1AndN_Solution(55));

    }
}

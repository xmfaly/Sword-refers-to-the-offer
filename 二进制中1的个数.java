/**
 * 一个数和这个数-1相与会把这个数最右边的1变成0
 */
public class 二进制中1的个数 {

    public int NumberOf1(int n) {

        int ans = 0;
        while(n != 0){
            ans++;
            n = n & (n - 1);
        }
        return ans;
    }
}

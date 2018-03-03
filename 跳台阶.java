public class 跳台阶 {
    public int JumpFloor(int target) {

        if (target == 1) {
            return 1;
        }
        if (target == 2) {
            return 2;
        }
        int a = 1, b = 2;
        int ans = 0;
        for (int i = 3; i <= target; i++) {
            ans = a + b;
            a = b;
            b = ans;
        }
        return  ans;
    }
}

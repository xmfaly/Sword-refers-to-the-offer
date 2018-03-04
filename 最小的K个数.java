import java.util.ArrayList;
import java.util.Arrays;

public class 最小的K个数 {

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        Arrays.sort(input);
        ArrayList<Integer> ans = new ArrayList<>();
        if(k > input.length){
            return ans;
        }
        for(int i = 0;i<k;i++){
            ans.add(input[i]);
        }
        return ans;
    }
}

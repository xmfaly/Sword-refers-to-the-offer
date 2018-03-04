public class 数字在排序数组中出现的次数 {

    public int GetNumberOfK(int [] array , int k) {
        int ans = 0;
        for(int i =0;i<array.length;i++){
            if(array[i] == k){
                while(i<array.length && array[i] == k){
                    ans++;
                    i++;
                }
                break;
            }
        }
        return ans;
    }
}

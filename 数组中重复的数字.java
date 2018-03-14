public class 数组中重复的数字 {

    public boolean duplicate(int numbers[], int length, int[] duplication) {

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (numbers[j] == numbers[i]) {
                    duplication[0] = numbers[i];
                    return true;
                }
            }
        }
        return false;
    }
}

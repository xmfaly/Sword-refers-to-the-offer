
import java.util.Comparator;

public class 把数组排成最小的数 {

    public String PrintMinNumber(int[] numbers) {

    }


}

class Mycmp implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {

        char[] a1 = o1.toString().toCharArray();
        char[] a2 = o2.toString().toCharArray();
        int i = 0;
        while (i < a1.length && i < a2.length) {
            if(a1[i] < a2[i]){
                return -1;
            }
            if(a1[i] > a2[i]){
                return 1;
            }
            i++;
        }
        return 0;
    }
}

import java.util.ArrayList;

public class 顺时针打印矩阵 {

    public static ArrayList<Integer> printMatrix(int[][] matrix) {

        ArrayList<Integer> ans = new ArrayList<>();

        int left = 0, right = matrix[0].length - 1, top = 0, buttom = matrix.length - 1;


        while (left <= right || top <= buttom) {


            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;
            if(top > buttom)
                break;
            for (int i = top; i <= buttom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;
            if(right< left)
                break;
            for (int i = right; i >= left; i--) {
                ans.add(matrix[buttom][i]);
            }
            buttom--;
            if(top > buttom)
                break;

            for (int i = buttom; i >= top; i--) {
                ans.add(matrix[i][left]);
            }
            left++;
            if(right< left)
                break;
        }
        return ans;

    }

    public static void main(String[] args) {
       // int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int matrix[][] = {{1,2,3,4,5}};
       // int matrix[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};

        ArrayList<Integer> a = printMatrix(matrix);

        for(int i  = 0;i<a.size();i++){
            System.out.print(a.get(i) + "  ");
        }
    }
}

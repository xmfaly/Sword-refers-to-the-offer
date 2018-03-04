import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class 从上往下打印二叉树 {

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        Queue<TreeNode> q = new LinkedBlockingQueue<>();
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        q.add(root);

        while(!q.isEmpty()){
            TreeNode h = q.poll();
            ans.add(h.val);
            if(h.left != null){
                q.add(h.left);
            }
            if(h.right != null){
                q.add(h.right);
            }
        }
        return ans;
    }
}

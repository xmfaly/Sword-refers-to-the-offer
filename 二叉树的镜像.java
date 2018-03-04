public class 二叉树的镜像 {

    public void Mirror(TreeNode root) {
        if(root == null)
            return;
        TreeNode tem = root.left;
        root.left = root.right;
        root.right = tem;
        Mirror(root.left);
        Mirror(root.right);
    }
}

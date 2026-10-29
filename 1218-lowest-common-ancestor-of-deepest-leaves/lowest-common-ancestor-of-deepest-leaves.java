class Solution {
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        if(root==null){
            return null;
        }
        int left=height(root.left);
        int right=height(root.right);
        if(left==right){
            return root;
        }
        if(left>right){
            return lcaDeepestLeaves(root.left);
        }
        return lcaDeepestLeaves(root.right);
    }
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
return 1+Math.max(height(root.left),height(root.right));
    }
}
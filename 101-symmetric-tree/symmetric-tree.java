/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        // Queue<TreeNode> q1=new LinkedList<>();
        // q1.add(root.left);
        // q1.add(root.right);
        // while(!q1.isEmpty()){
        //     TreeNode left=q1.remove();
        //     TreeNode right=q1.remove();
        //     if(left==null && right==null){
        //         continue;
        //     }
        //     if(left==null || right==null){
        //         return false;
        //     }
        //     if(left.val!=right.val){
        //         return false;
        //     }
        //     q1.add(left.left);
        //     q1.add(right.right);
        //     q1.add(left.right);
        //     q1.add(right.left);
        // }
        // return true;
        if(root==null){
            return true;
        }
        return check(root.left,root.right);
    }
    public boolean check(TreeNode left,TreeNode right){
        if(left==null && right==null){
            return true;
        }
        if(left==null || right==null){
            return false;
        }
        if(left.val!=right.val){
            return false;
        }
        return check(left.left,right.right) && check(left.right,right.left);
    }
}
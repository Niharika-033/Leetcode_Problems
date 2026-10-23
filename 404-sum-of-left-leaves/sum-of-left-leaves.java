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
    public int sumOfLeftLeaves(TreeNode root) {
        Queue<TreeNode> q1=new LinkedList<>();
        if(root==null){
            return -1;
        }
        if(root.left==null && root.right==null){
            return 0;
        }
        q1.add(root);
        int sum=0;
        while(!q1.isEmpty()){
            int size=q1.size();

            for(int i=0;i<size;i++){
                 TreeNode curr=q1.remove();
                 if(curr.left!=null){
                    if(curr.left.left==null && curr.left.right==null){
                         sum=sum+curr.left.val;
                    }
                    else{
                       q1.add(curr.left);
                    }
                }
                 if(curr.right!=null){
                    q1.add(curr.right);
                 }
            }
        }
        return sum;
    }
}
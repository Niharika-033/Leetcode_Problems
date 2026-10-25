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
    public int maxDepth(TreeNode root) {
        // Queue<TreeNode> q1=new LinkedList<>();
        // if(root==null){
        //     return 0;
        // }
        // if(root.left==null && root.right==null){
        //     return 1;
        // }
        // q1.add(root);
        // int level=0;
        // while(!q1.isEmpty()){
        //     int size=q1.size();
        //     for(int i=0;i<size;i++){
        //     TreeNode curr=q1.remove();
        //    if(curr.left!=null){
        //     q1.add(curr.left);
        //    }
        //    if(curr.right!=null){
        //     q1.add(curr.right);
        //    }
        //     }
          
        //    level++;
        // }
        // return level;
        if(root==null){
            return 0;
        }
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);
        
        return 1+Math.max(left,right);
    }
}
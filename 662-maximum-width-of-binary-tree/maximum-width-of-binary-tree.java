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
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> q1=new LinkedList<>();
        Queue<Integer> q2=new LinkedList<>();
        int max=Integer.MIN_VALUE;
        int index=0;
        int first=0;
        int last=0;
        q1.add(root);
        q2.add(index);
        while(!q1.isEmpty()){
            int size=q1.size();
            for(int i=0;i<size;i++){
                TreeNode curr=q1.remove();
                int pos=q2.remove();
                
                if(i==0){
                    first=pos;
                }
                if(i==size-1){
                    last=pos;
                }
                if(curr.left!=null){
                    q1.add(curr.left);
                    q2.add(2*pos);

                }
                if(curr.right!=null){
                    q1.add(curr.right);
                    q2.add(2*pos+1);
                }
            }
        
            int width = last - first + 1;
            max = Math.max(max, width);
        
        }
        return max;
    }
}
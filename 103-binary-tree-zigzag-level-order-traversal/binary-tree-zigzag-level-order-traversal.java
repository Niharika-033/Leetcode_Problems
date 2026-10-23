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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null){
            return ans;
        }
        q.add(root);
         int level=1;
        while(!q.isEmpty()){
            List<Integer>lis=new ArrayList<>();
            int size=q.size();
               
            for(int i=0;i<size;i++){
            TreeNode curr=q.remove();
        
            if(curr.left!=null){
              q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
             lis.add(curr.val);
             
            }
            if(level%2==0){
                Collections.reverse(lis);
            }
            level++;
            ans.add(lis);
          

        }
        return ans;
    }
}
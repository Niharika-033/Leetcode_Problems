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
    public long kthLargestLevelSum(TreeNode root, int k) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        ArrayList<Long> ls=new ArrayList<>();
        while(!q.isEmpty()){
            
            int size=q.size();
            long sum=0;
            for(int i=0;i<size;i++){
                TreeNode curr=q.remove();
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
                sum=sum+curr.val;
            }
            ls.add(sum);
           

            
        }
         Collections.sort(ls, Collections.reverseOrder());
         for(int i=0;i<ls.size();i++){
                if(i==k-1){
                    return ls.get(i);
                }
            }
            return -1;
    }
}
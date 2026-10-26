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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
          if(depth==1){
              TreeNode new1=new TreeNode(val);
              new1.left=root;
              return new1;
            }
        if(root==null){
            return null;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int level=1;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode curr=q.remove();
            if(level==depth-1){
                 TreeNode new1=new TreeNode(val);
                 TreeNode new2=new TreeNode(val);
                 new1.left=curr.left;
                 new2.right=curr.right;
                 curr.left=new1;
                 curr.right=new2;
            }
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
            }
            level++;
        }
        return root;
    }
}
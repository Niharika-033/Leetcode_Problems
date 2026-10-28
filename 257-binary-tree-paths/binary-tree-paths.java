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
    List<String>ans=new ArrayList<>();
    StringBuilder sb=new StringBuilder();
    public List<String> binaryTreePaths(TreeNode root) {
        if(root==null){
            return ans;
        }
         int len = sb.length();
        if (sb.length() > 0) {
            sb.append("->");
         }
        sb.append(root.val);
        if(root.left==null && root.right==null){
            ans.add(sb.toString());
        }
        binaryTreePaths(root.left);
        binaryTreePaths(root.right);
         sb.setLength(len);
        return ans;
     }
}
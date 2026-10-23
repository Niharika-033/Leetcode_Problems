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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        Queue<TreeNode> q = new LinkedList<>();
        Queue<Integer> sum = new LinkedList<>();
        q.add(root);
        sum.add(root.val);
        while (!q.isEmpty()) {
            TreeNode curr = q.remove();
            int s = sum.remove();
         if (curr.left == null && curr.right == null) {
                if (s == targetSum) {
                    return true;
                }
            }
            if (curr.left != null) {
                q.add(curr.left);
                sum.add(s + curr.left.val);
            }

            if (curr.right != null) {
                q.add(curr.right);
                sum.add(s + curr.right.val);
            }
        }

        return false;
    }
}
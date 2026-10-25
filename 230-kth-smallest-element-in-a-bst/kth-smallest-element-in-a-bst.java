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
    ArrayList<Integer> lis = new ArrayList<>();
   public int kthSmallest(TreeNode root, int k) {
        inorder(root);
    Collections.sort(lis);
        return lis.get(k - 1);
    }
public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        lis.add(root.val);
        inorder(root.left);
        inorder(root.right);
    }
}

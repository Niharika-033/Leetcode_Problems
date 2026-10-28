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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            boolean a = false;
            boolean b = false;
        for (int i = 0; i < size; i++) {
            TreeNode curr = q.remove();
        if (curr.left != null && curr.right != null) {
            if ((curr.left.val == x && curr.right.val == y) ||(curr.left.val == y && curr.right.val == x)) {
                    return false;
                    }
                }
               if (curr.left != null) {
                    q.add(curr.left);
                    if (curr.left.val == x) a = true;
                    if (curr.left.val == y) b = true;
                }
                if (curr.right != null) {
                    q.add(curr.right);
                    if (curr.right.val == x) a = true;
                    if (curr.right.val == y) b = true;
                }
            }

            if (a && b) return true;
            if (a || b) return false;
        }

        return false;
    }
}

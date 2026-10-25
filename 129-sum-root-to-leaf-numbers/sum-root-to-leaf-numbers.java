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
  public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
       lis.add(root.val);
       int sum = 0;
        int num = 0;
       if (root.left == null && root.right == null) {
        for (int i = 0; i < lis.size(); i++) {
                num = num * 10 + lis.get(i);
            }
        lis.remove(lis.size() - 1);
            return num;
        }
        sum = sum + sumNumbers(root.left);
        sum = sum + sumNumbers(root.right);
        lis.remove(lis.size() - 1);
        return sum;
    }
}
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
import java.util.*;
class Solution {
    int count = 0;
    public int pathSum(TreeNode root, int targetSum) {
        ArrayList<Integer> list = new ArrayList<>();
        count = 0;
        dfs(root, targetSum, list);
        return count;
    }
    public void dfs(TreeNode root, int targetSum, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        long sum = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            sum += list.get(i);
            if (sum == targetSum) {
                count++;
            }
        }
        dfs(root.left, targetSum, list);
        dfs(root.right, targetSum, list);
        list.remove(list.size() - 1);
    }
}
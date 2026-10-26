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
    HashMap<Integer, Integer> map = new HashMap<>();
    int level = 1;
    int maxValue = Integer.MIN_VALUE;
    int ans = -1;

    public int findBottomLeftValue(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (level == 1) {
            map.clear();
            maxValue = Integer.MIN_VALUE;
            ans = -1;
        }

        if (root.left == null && root.right == null) {
            if (!map.containsKey(level)) {
                map.put(level, root.val);
            }
        }

        level++;
        findBottomLeftValue(root.left);
        findBottomLeftValue(root.right);
        level--;

        if (level == 1) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getKey() > maxValue) {
                    maxValue = entry.getKey();
                    ans = entry.getValue();
                }
            }
        }

        return ans;
    }
}
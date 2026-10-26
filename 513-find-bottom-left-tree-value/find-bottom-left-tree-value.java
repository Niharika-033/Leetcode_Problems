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
    int maxLevel = 0;

    public int findBottomLeftValue(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (level == 1) {
            map.clear();
            maxLevel = 0;
        }

        if (!map.containsKey(level)) {
            map.put(level, root.val);
        }

        maxLevel = Math.max(maxLevel, level);

        level++;
        findBottomLeftValue(root.left);
        findBottomLeftValue(root.right);
        level--;

        if (level == 1) {
            return map.get(maxLevel);
        }

        return map.get(maxLevel);
    }
}  


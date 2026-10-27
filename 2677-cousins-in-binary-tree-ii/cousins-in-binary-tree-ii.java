class Solution {
    public TreeNode replaceValueInTree(TreeNode root) {
        if (root == null) {
            return null;
        }
 Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        root.val = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            TreeNode[] nodes = new TreeNode[size];
            int sum = 0;
            for (int i = 0; i < size; i++) {
                nodes[i] = q.remove();
            if (nodes[i].left != null) {
                    sum += nodes[i].left.val;
                }
            if (nodes[i].right != null) {
                    sum += nodes[i].right.val;
                }
            }
             for (int i = 0; i < size; i++) {
                TreeNode curr = nodes[i];
                int siblingSum = 0;
                if (curr.left != null) {
                    siblingSum += curr.left.val;
                }
                if (curr.right != null) {
                    siblingSum += curr.right.val;
                }
               int cousinSum = sum - siblingSum;
                if (curr.left != null) {
                    curr.left.val = cousinSum;
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    curr.right.val = cousinSum;
                    q.add(curr.right);
                }
            }
        }

        return root;
    }
}

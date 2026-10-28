class Solution{
    int ans=0;
    public int maxAncestorDiff(TreeNode root){
        if(root==null){
            return 0;
        }
        find(root,root.val,root.val);
        return ans;
    }
    public void find(TreeNode root,int min,int max){
        if(root==null){
            return;
        }
        min=Math.min(min,root.val);
        max=Math.max(max,root.val);
        ans=Math.max(ans,max-min);
        find(root.left,min,max);
        find(root.right,min,max);
    }
}
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=-1;
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<i+nums.length;j++){
                int n=nums.length;
               int idx=j%n;
               if(nums[idx]>nums[i]){
                arr[i]=nums[idx];
                break;
               }
            }
        }
        return arr;
    }
}
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        // int arr[]=new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     arr[i]=-1;
        // }
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<i+nums.length;j++){
        //         int n=nums.length;
        //        int idx=j%n;
        //        if(nums[idx]>nums[i]){
        //         arr[i]=nums[idx];
        //         break;
        //        }
        //     }
        // }
        // return arr;



        Stack<Integer> st=new Stack<>();
        int arr[]=new int[nums.length];
        int n=nums.length;
        for(int i=2*n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums[i%n]){
                st.pop();
            }
            if(i<n){
                if(!st.isEmpty()){
                    arr[i]=st.peek();
            }
            else{
                arr[i]=-1;
            }
            }
            st.push(nums[i%n]);
          
        }
        return arr;
    }
}
class Solution {
    public int minMaxGame(int[] nums) {
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        int k=0;

        for(int i=0;i<nums.length;i=i+4){
            if(i<nums.length){
                if(i+1 < nums.length){
                    arr1.add(k, Math.min(nums[i],nums[i+1]));
                    k++;
                }
                else{
                    arr1.add(k,nums[i]);
                    k++;
                }
            }

            if(i+2 < nums.length){
                if(i+3 < nums.length){
                    arr1.add(k,Math.max(nums[i+2],nums[i+3]));
                    k++;
                }
                else{
                    arr1.add(k,nums[i+2]);
                    k++;
                }
            }
        }

        while(arr1.size()>1){
            int l=0;

            for(int j=0;j<arr1.size();j=j+4){
                if(j+1 < arr1.size()){
                    arr2.add(l,Math.min(arr1.get(j),arr1.get(j+1)));
                    l++;
                }

                if(j+3 < arr1.size()){
                    arr2.add(l,Math.max(arr1.get(j+2),arr1.get(j+3)));
                    l++;
                }
            }

            arr1.clear();

            for(int i=0;i<arr2.size();i++){
                arr1.add(arr2.get(i));
            }

            arr2.clear();
        }

        return arr1.get(0);
    }
}
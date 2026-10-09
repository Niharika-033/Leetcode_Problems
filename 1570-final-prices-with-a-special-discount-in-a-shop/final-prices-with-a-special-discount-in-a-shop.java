class Solution {
    public int[] finalPrices(int[] prices) {
        int arr[]=new int[prices.length];
        for(int i=0;i<prices.length;i++){
            arr[i]=prices[i];
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]>=prices[j]){
                    arr[i]=prices[i]-prices[j];
                    break;
                }
              
            }
        }
        return arr;
    }
}
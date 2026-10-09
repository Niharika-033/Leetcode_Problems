class Solution {
    public int[] finalPrices(int[] prices) {
        // for(int i=0;i<prices.length;i++){
        //     for(int j=i+1;j<prices.length;j++){
        //         if(prices[i]>=prices[j]){
        //             prices[i]=prices[i]-prices[j];
        //             break;
        //         }
              
        //     }
        // }
        // return prices;

        Stack<Integer>stack=new Stack<>();
        
        for(int i=0;i<prices.length;i++){
            while(!stack.isEmpty() && prices[stack.peek()] >= prices[i]){
                int idx=stack.pop();
                prices[idx]=prices[idx]-prices[i];

            }
            stack.push(i);
        }
        return prices;
    }
}
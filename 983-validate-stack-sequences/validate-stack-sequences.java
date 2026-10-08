class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int k=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<pushed.length;i++){
            st.push(pushed[i]);
            while(!st.isEmpty() && st.peek()==popped[k]){
                st.pop();
                k++;

            }
        }
        return st.isEmpty();
    }
}
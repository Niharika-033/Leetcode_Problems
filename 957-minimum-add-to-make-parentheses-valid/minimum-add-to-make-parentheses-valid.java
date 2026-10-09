class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++){
           if(!st.isEmpty() && s.charAt(i)==')'){
            st.pop();
           }
           else if(s.charAt(i)==')'){
            count++;
           }
           else if(s.charAt(i)=='('){
            char a=s.charAt(i);
            st.push(a);
           }
           
        }
        return count+st.size();
    }
}
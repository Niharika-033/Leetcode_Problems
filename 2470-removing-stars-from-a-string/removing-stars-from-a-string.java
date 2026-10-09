class Solution {
    public String removeStars(String s) {
        StringBuilder sb=new StringBuilder();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='*'){
                st.push(s.charAt(i));
            }
            else{
                st.pop();
            }
        }
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        
       return sb.reverse().toString();
    }
}
class Solution {
    public boolean isValid(String s) {
        if(s.length()==1){
            return false;
        }
    //     Stack<Character>s=new Stack<>();
    //   for(int i=0;i<str.length();i++){
    //      char ch=str.charAt(i);
    //      if(ch=='(' || ch=='{' || ch=='['){
    //         s.push(ch);
    //      }
    //      else{
    //         if(s.isEmpty()){
    //             return false;
    //         }
    //         char top=s.pop();
    //         if(ch==')' && top!='('){
    //             return false;
    //         }
    //         if(ch=='}' && top!='{'){
    //             return false;
    //         }
    //         if(ch==']' && top!='['){
    //             return false;
    //         }
    //      }
    //   }
    //   return s.isEmpty();

    //   while(s.contains("()") || s.contains("[]") || s.contains("{}")){
    //     s=s.replace("()" ,"");
    //     s=s.replace("[]","");
    //     s=s.replace("{}","");

    //   }
    //   if(s.length()==0){
    //     return true;
    //   }
    //   return false;

   Stack<Character> st=new Stack<>();
   int i=0;
   while(i<s.length()){

    char a=s.charAt(i);
    if(a=='(' || a=='[' || a== '{'){
        st.push(a);
    }
    else{

        if (st.isEmpty()) {
            return false;
        }
    
      char c=st.peek();

    if(c=='(' && a!=')'){
        return false;
    }
    else if(c=='{' && a!='}'){
        return false;
    }
    else if(c=='[' && a!=']'){
        return false;
    }
    st.pop();
    
   

   }
    i++;

    }
    
   
    return st.isEmpty();
    

   
   }
}
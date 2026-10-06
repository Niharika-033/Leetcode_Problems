class Solution {
    public String compressedString(String word) {
        int i=0;
        int j=0;
        String s="";
       while(j<word.length()){
          int count=0;
          i=j;
          while(j<word.length() && word.charAt(i)==word.charAt(j) && count<9){
            count++;
            j++;
          }
          s=s+count;
          s=s+word.charAt(i);
            
        }
        return s;
    }
}
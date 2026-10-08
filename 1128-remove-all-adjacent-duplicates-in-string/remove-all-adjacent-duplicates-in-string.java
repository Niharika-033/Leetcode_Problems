class Solution {
    public String removeDuplicates(String s) {
        int i = 0;
        Stack<Character> st = new Stack<>();

        while (i < s.length()) {
            char a = s.charAt(i);

            if (!st.isEmpty() && a == st.peek()) {
                st.pop();
            } else {
                st.push(a);
            }

            i++;
        }

        StringBuilder sb = new StringBuilder();

        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        sb.reverse();

        return sb.toString();
    }
}
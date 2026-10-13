import java.util.*;

class Solution {
    public int countCollisions(String d) {
        Stack<Character> st = new Stack<>();
        int count = 0;

        for (int i = 0; i < d.length(); i++) {
            char ch = d.charAt(i);

            if (ch == 'L') {
                if (!st.isEmpty() && st.peek() == 'R') {
                    count += 2;
                    st.pop();

                    while (!st.isEmpty() && st.peek() == 'R') {
                        count++;
                        st.pop();
                    }

                    st.push('S');
                } 
                else if (!st.isEmpty() && st.peek() == 'S') {
                    count++;
                } 
                else {
                    st.push(ch);
                }
            } 
            else if (ch == 'S') {
                if (!st.isEmpty() && st.peek() == 'R') {
                    count++;
                    st.pop();

                    while (!st.isEmpty() && st.peek() == 'R') {
                        count++;
                        st.pop();
                    }
                }
                st.push('S');
            } 
            else {
                st.push(ch);
            }
        }

        return count;
    }
}
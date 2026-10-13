// import java.util.*;

// class Solution {
//     public int countCollisions(String d) {
//         Stack<Character> st = new Stack<>();
//         int count = 0;

//         for (int i = 0; i < d.length(); i++) {
//             char ch = d.charAt(i);

//             if (ch == 'L') {
//                 if (!st.isEmpty() && st.peek() == 'R') {
//                     count += 2;
//                     st.pop();

//                     while (!st.isEmpty() && st.peek() == 'R') {
//                         count++;
//                         st.pop();
//                     }

//                     st.push('S');
//                 } 
//                 else if (!st.isEmpty() && st.peek() == 'S') {
//                     count++;
//                 } 
//                 else {
//                     st.push(ch);
//                 }
//             } 
//             else if (ch == 'S') {
//                 if (!st.isEmpty() && st.peek() == 'R') {
//                     count++;
//                     st.pop();

//                     while (!st.isEmpty() && st.peek() == 'R') {
//                         count++;
//                         st.pop();
//                     }
//                 }
//                 st.push('S');
//             } 
//             else {
//                 st.push(ch);
//             }
//         }

//         return count;
//     }
// }
class Solution {
    public int countCollisions(String d) {
        int i = 0;
        int j = d.length() - 1;

        while (i < d.length() && d.charAt(i) == 'L') {
            i++;
        }

        while (j >= i && d.charAt(j) == 'R') {
            j--;
        }

        int count = 0;

        for (int k = i; k <= j; k++) {
            if (d.charAt(k) != 'S') {
                count++;
            }
        }

        return count;
    }
}
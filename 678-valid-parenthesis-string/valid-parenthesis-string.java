import java.util.Stack;

// class Solution {
//     public boolean checkValidString(String s) {
//         Stack<Integer> st = new Stack<>();
//         Stack<Integer> star = new Stack<>();

//         for (int i = 0; i < s.length(); i++) {
//             if (s.charAt(i) == '(') {
//                 st.push(i);
//             }
//             else if (s.charAt(i) == '*') {
//                 star.push(i);
//             }
//             else {
//                 if (!st.isEmpty()) {
//                     st.pop();
//                 }
//                 else if (!star.isEmpty()) {
//                     star.pop();
//                 }
//                 else {
//                     return false;
//                 }
//             }
//         }

//         while (!st.isEmpty() && !star.isEmpty()) {
//             if (st.pop() > star.pop()) {
//                 return false;
//             }
//         }
//         return st.isEmpty();
//     }
// }


//optimal solution

class Solution {
    public boolean checkValidString(String s) {
        int minOpen = 0;
        int maxOpen = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                minOpen++;
                maxOpen++;
            }
            else if (ch == ')') {
                minOpen--;
                maxOpen--;
            }
            else {
                minOpen--;
                maxOpen++;
            }

            if (maxOpen < 0) {
                return false;
            }

            if (minOpen < 0) {
                minOpen = 0;
            }
        }

        return minOpen == 0;
    }
}
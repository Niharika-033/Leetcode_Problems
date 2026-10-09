
import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            int a = asteroids[i];

            while (!st.isEmpty() && a < 0 && st.peek() > 0) {
                if (st.peek() < -a) {
                    st.pop();
                }
                else if (st.peek() == -a) {
                    st.pop();
                    a = 0;
                    break;
                }
                else {
                    a = 0;
                    break;
                }
            }

            if (a != 0) {
                st.push(a);
            }
        }

        int[] ans = new int[st.size()];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = st.get(i);
        }

        return ans;
    }
}
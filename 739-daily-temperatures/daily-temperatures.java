
import java.util.Stack;
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int arr[] = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        while (i < temperatures.length) {
         while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
            int index = stack.pop();
              arr[index] = i - index;
            }
             stack.push(i);
             i++;
        }

        return arr;
    }
}


class Solution {
    public int evalRPN(String[] tokens) {
     Stack<Integer> stack = new Stack<>();
     for (int i = 0; i < tokens.length; i++) {
         String current = tokens[i];
           if (current.equals("+") ||current.equals("-") ||current.equals("*") ||current.equals("/")) {
            int b = stack.pop();
            int a = stack.pop();
            int result = 0;
            if (current.equals("+")) {
                    result = a + b;
                }
            else if (current.equals("-")) {
                    result = a - b;
                }
            else if (current.equals("*")) {
                    result = a * b;
                }
            else {
                    result = a / b;
                }

                stack.push(result);
            }
            else {
                stack.push(Integer.parseInt(current));
            }
        }

        return stack.pop();
    }
}
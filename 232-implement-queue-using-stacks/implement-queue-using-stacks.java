// class MyQueue {
//     Stack<Integer>s1=new Stack<>();
//     Stack<Integer>s2=new Stack<>();
// // public MyQueue() {
        
// //     }
    
//     public void push(int x) {
//         s2.push(x);
//         while(!s1.isEmpty()){
//          s2.push(s1.pop());
//         }
//         Stack<Integer> temp=s1;
//         s1=s2;
//         s2=temp;
//     }
    
//     public int pop() {
//         return s1.pop();
//     }
    
//     public int peek() {
//         return s1.peek();
//     }
    
//     public boolean empty() {
//         return s1.isEmpty();
//     }
// }

import java.util.*;

class MyQueue {

    Stack<Integer> s = new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        s.push(x);
    }
    
    public int pop() {
        if(s.size() == 1){
            return s.pop();
        }

        int x = s.pop();

        int ans = pop();

        s.push(x);

        return ans;
    }
    
    public int peek() {
        if(s.size() == 1){
            return s.peek();
        }

        int x = s.pop();

        int ans = peek();

        s.push(x);

        return ans;
    }
    
    public boolean empty() {
        return s.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
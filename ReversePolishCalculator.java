// Version: 20200917
// Handin done by:
//   202108331 Martin Pugdal Pedersen
// Contributions:
//   Martin Everything

import java.io.*;
import java.util.*;
public class ReversePolishCalculator {
    
    public Stack<Integer> stack = new Stack<Integer>();
    
    public void push(int n) {
        stack.push(n);
    }

    public void plus() {
        int n1 = stack.pop();
        int n2 = stack.pop();
        stack.push(n1 + n2);
    }

    public void minus() {
        int n1 = stack.pop();
        int n2 = stack.pop();
        stack.push(n2 - n1);    
    }

    public void times() {
        int n1 = stack.pop();
        int n2 = stack.pop();
        stack.push(n1 * n2);    
    }

    public int read() {
        // Implement your code here to read the top element from the stack (without removing it)
        return stack.get(stack.size() - 1);
    }
}
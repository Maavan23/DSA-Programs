package batch49;
import java.util.Stack;

public class StackExample1 {
       public static void main (String[] args) {
       //create the stack-stack1
       Stack<Integer> stack1 = new Stack<>();
       //push elements
       stack1.push(2);
       stack1.push(3);
       stack1.push(6);
       stack1.push(7);
       stack1.push(1);
       // Display stack
       System.out.println(stack1);    
       System.out.println("Peek the stack:"+ stack1.peek());
       System.out.println("Pop/remove top element:"+ stack1.pop());
       System.out.println("Pop/remove top element:"+ stack1.pop());

       System.out.println("Stack after popping:"+ stack1); 
        
  }
}

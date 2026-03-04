package batch49;
import java.util.Queue;
import java.util.LinkedList;
public class QueuesExample {
    public static void main (String[] args) {
       Queue<Integer> queue1 = new LinkedList<>(); //create queue
       //add elements
       queue1.add(10);
       queue1.add(20);
       queue1.add(30);
       queue1.add(40);
       queue1.add(50);
       System.out.println("Initial Queue elements:"+ queue1); 
       //remove values
       queue1.remove();
       //peek
       queue1.peek();
       System.out.println("Quick elements peek:"+ queue1.peek()); 
   }
}

package batch49;
import java.util.LinkedList;
public class LinkedListExample {
    public static void main (String[] args) {  
     LinkedList<String> list = new LinkedList<>(); //create linked list
     //add elements
     list.add("Car");
     list.add("Van");
     list.add("Jeep");
     list.add("Lorry");
     list.add("Bus");
     list.add("Train");

     System.out.println(list);
     //add one at first
     list.addFirst("Ship");
     list.addLast("Boat");
     System.out.println(list);

     //remove
     list.remove("Boat");
     System.out.println(list);
     list.addLast("Ytach");
     System.out.println(list);
   }
}

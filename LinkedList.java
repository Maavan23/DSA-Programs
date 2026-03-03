package batch49;

public class LinkedList {
    //node class
       class Node {
           int data;
           Node next;
           Node(int data) {
                this.data = data;
                this.next = null;
           }
       }
       Node head = null;
       //create LL(LinkedList)
       public void createList ()  {
           head = null;
           System.out.println("Linked list created successfully!");
       }
       //insert a front
       public void insertAtFront(int data){
          Node newNode = new Node(data);
          newNode.next = head;
          head = newNode;
          System.out.println(data + "Inseted at front");
       }
       //Inserted at rear
       public void insertAtRear(int data){
           Node newNode = new Node(data);
           
           if(head == null){
           //adding new node as head 
           head = newNode;    
           } else {
               Node temp = head;
               while(temp.next != null){
                   temp = temp.next;
               }
               temp.next = newNode;
           }
           System.out.println(data + " inserted at rear");
       }
       //insert at specific location
       public void insertAtLocalation (int data,int location ) {
           Node newNode = new Node(data);
           
           if(location == 1){
                newNode.next = head;
                head = newNode;
                return;
           }
           Node temp = head;
           for(int i = 1; i < location - 1 && temp != null; i++){
           temp = temp.next;
           }
           if(temp == null){
              System.out.println("Invalid location.");
              return;
           }
           newNode.next = temp.next;
           temp.next = newNode;
           System.out.println(data +" Inserted at "+ location);
       }
       public void display(){
          if (head == null){
             System.out.println("Link list is empty");
             return;
          }
          Node temp = head;
          System.out.println("Linked List:");
          while(temp != null){
             System.out.print(temp.data + "->");
             temp = temp.next;
          }
          System.out.println("NULL");
       }
       //main method
       public static void main(String[] args){
          LinkedList ll = new LinkedList();
          ll.display();
          ll.createList();
          ll.display();
          ll.insertAtFront(56);
          ll.insertAtFront(100);
          ll.display();
          ll.insertAtRear(67);
          ll.insertAtLocalation(56789, 2);
          ll.display();
       }
}     

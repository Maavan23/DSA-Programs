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
       
       //delete head node 
       public void deleteHead(){
         if(head == null){
             System.out.println("Empty Linked list!");
             return;
         }
         System.out.println(head.data + "deleted from head");
         head = head.next;
         System.out.println("previous head deleted.");
       }
       //delete the tail node
       public void deleteTail(){
           if (head == null) {
              System.out.println("Empty Linked List");
           }   
           if (head.next == null){
              System.out.println("Delete date/no date");
              head = null;
              return;
           }
           Node temp = head;
           while(temp.next.next != null){
              temp = temp.next;
           }
           temp.next = null;
           System.out.println("Tail data deleted");
       }
       
       //delete at a specific location
       public void deleteAtLocation(int p){
          if(head == null){
             System.out.println("Linked List is empty");
             return;
          }
          if(p == 1){
              System.out.println(head.data +" deleted/head deleted");
              head = head.next;
              return;
          }
          Node temp = head;
            for(int i = 0 ; i < p - 1 && temp.next != null; i++){ 
               temp = temp.next;
            }
            if(temp.next == null){
             System.out.println("Invalid position/not found");
             return;
            }
       
        
       }
       //search an element
       public void search(int key){
          Node temp = head;
          int position = 1;
          
          while(temp != null){
              if(temp.data == key){
                   System.out.println(key +" Found at "+ position);
                   return;
              }
              temp = temp.next;
              position++;
          }
          System.out.println(key +" Not found in the linked list");
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
          ll.deleteHead();
          ll.display();
          ll.deleteTail();
          ll.deleteAtLocation(6);
          ll.display();
          ll.search(56789);
          ll.display();
       }
}     

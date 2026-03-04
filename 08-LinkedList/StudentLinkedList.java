package batch49;

public class StudentLinkedList {
    // Node class
    class Node {
        int id;
        String name;
        double marks;
        Node next;

        Node(int id, String name, double marks) {
            this.id = id;
            this.name = name;
            this.marks = marks;
            this.next = null;
        }
    }

    Node head = null;

    // Insert at Front
    public void insertAtFront(int id, String name, double marks) {
        Node newNode = new Node(id, name, marks);
        newNode.next = head;
        head = newNode;
        System.out.println("Inserted at front: " + name);
    }

    // Insert at Rear
    public void insertAtRear(int id, String name, double marks) {
        Node newNode = new Node(id, name, marks);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Inserted at rear: " + name);
    }

    // Insert at specific position
    public void insertAtPosition(int id, String name, double marks, int position) {
        Node newNode = new Node(id, name, marks);

        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        System.out.println("Inserted " + name + " at position " + position);
    }

    // Delete rear
    public void deleteRear() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            System.out.println("Deleted: " + head.name);
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        System.out.println("Deleted: " + temp.next.name);
        temp.next = null;
    }

    // Search by student ID
    public void search(int id) {
        Node temp = head;
        int position = 1;

        while (temp != null) {
            if (temp.id == id) {
                System.out.println("Student found at position " + position +
                        " | Name: " + temp.name +
                        " | Marks: " + temp.marks);
                return;
            }
            temp = temp.next;
            position++;
        }
        System.out.println("Student ID " + id + " not found.");
    }

    // Find highest marks
    public void findHighestMarks() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        Node highest = head;

        while (temp != null) {
            if (temp.marks > highest.marks) {
                highest = temp;
            }
            temp = temp.next;
        }

        System.out.println("Top Student:");
        System.out.println("ID: " + highest.id +
                " | Name: " + highest.name +
                " | Marks: " + highest.marks);
    }

    // Display list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        System.out.println("\nStudent Records:");
        while (temp != null) {
            System.out.println("ID: " + temp.id +
                    " | Name: " + temp.name +
                    " | Marks: " + temp.marks);
            temp = temp.next;
        }
    }
    
     // Main method
    public static void main(String[] args) {

        StudentLinkedList list = new StudentLinkedList();

        // 1. Insert at rear
        list.insertAtRear(1, "Alice", 78.5);

        // 2. Insert at front
        list.insertAtFront(2, "Bob", 85.0);

        // 3. Insert five students at positions 2,3,4,5,6,7
        list.insertAtPosition(3, "Charlie", 92.3, 2);
        list.insertAtPosition(4, "David", 67.4, 3);
        list.insertAtPosition(5, "Eva", 88.9, 4);
        list.insertAtPosition(6, "Frank", 74.2, 5);
        list.insertAtPosition(7, "Grace", 95.6, 6);
        list.insertAtPosition(8, "Helen", 81.0, 7);

        list.display();

        // 4. Delete rear and search
        list.deleteRear();
        list.search(5);

        // 5. Find highest marks
        list.findHighestMarks();

        list.display();
    }
}

package batch49;

import  java.util.LinkedList;

public class DoubleLinkedList {
      public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        
        list.addFirst(19);
        list.add(9);
        list.add(123);

        System.out.println(list);
        list.removeLast();
        System.out.println(list);
  }
}

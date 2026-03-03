package batch49;


class treeDemo {
     int data;
     treeDemo left, right;
     
     treeDemo(int value) {
         data = value;
         left = right = null;
     }
     
     
        public static void inorder(treeDemo root) { //static
               if(root!=null) {
                    inorder(root.left);
                    System.out.print(root.data+" ");
                    inorder(root.right);
               } 
         }
        
        public static void main(String[] args) {
            //add/create nodes
               treeDemo root = new treeDemo(5);
               root.left = new treeDemo(10);
               root.right = new treeDemo(3);
               root.left.left = new treeDemo(3);
               root.right.right = new treeDemo(20);
               System.out.println("Inorder traversal:");
               inorder(root);
        }      

    
}

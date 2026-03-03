package batch49;
public class GraphMatrix {
    private int vertices;
    private int [][] matrix;
    
    public GraphMatrix(int vertices) {
        this.vertices = vertices;
        matrix = new int [vertices][vertices];
    }
    //add edge- no directions
    public void addEdge(int source, int destination){
       matrix[source][destination] = 1;
       matrix[destination][source] = 1;
}    
//print matrix
public void printGraph(){
    System.out.println("Adjacentcy Matrix :");
    
    for(int i = 0; i < vertices; i++){
        for(int j = 0; j < vertices; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
      }
   }

   public static void main (String[] args) {
       GraphMatrix graph = new GraphMatrix(4);
       
       graph.addEdge(0, 1);
       graph.addEdge(0, 2);
       graph.addEdge(1, 3);
//     graph.addEdge(0, 2);
//     graph.addEdge(2, 3);
       
       graph.printGraph();
   }
        
}
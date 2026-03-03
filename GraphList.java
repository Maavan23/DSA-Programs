package batch49;
import java.util.*;
public class GraphList {
    private int vertices;
    private LinkedList<Integer>[] adList;
    
    public GraphList(int vertices){
       this.vertices = vertices;
       adList = new LinkedList[vertices];
       
       for(int i = 0; i < vertices; i++) {
           adList[i] = new LinkedList<>();
       }
    }
    //add edge
    public void addEdge(int source, int destination){
        adList [source].add(destination);
        adList [destination].add(source);
    }
    //print graph
    public void printGraph(){
        System.out.println("Adjaceny List:");
        
        for(int i = 0; i < vertices; i++){
           System.out.print(i + "->");
           for(Integer node: adList[i]){
               System.out.print(node +  " ");
           }
           System.out.println();
        }
    }
    
    public static void main(String[] args) {
        GraphList g = new GraphList(5);
        //add edges
        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        
        g.printGraph();
    }
    
}

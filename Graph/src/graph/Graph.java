package graph;

/**
 *
 * @author sabil
 */
public class Graph<G> {
    G[] vertex;
    LinkedList list[];
    boolean directed = false;
    
    public Graph(G[] vertex){
        this.vertex = vertex;
        list = new LinkedList[vertex.length];
        for(int i = 0; i < vertex.length; i++){
            list[i] = new LinkedList();
        }
    }
    
    public boolean graphType(){
        return directed;
    }
    
    public void addEdge(int source, int destination){
        list[source].addFirst(destination);
        
        if(!graphType())list[destination].addFirst(source);
    }
    
    public void degree(int source)throws Exception{
        if(!graphType()){
            System.out.println("degree vertex "+source +" : "+list[source].size());
        }else if(graphType()){
            int k, totalIn = 0, totalOut = 0;
            for(int i = 0; i < vertex.length; i++){
                for(int j = 0; j < list[i].size(); j++){
                    if(list[i].get(j)==source){
                    ++totalIn;
                }
            }
            for(k = 0; k < list[source].size(); k++){
            list[source].get(k);
            }
            totalOut = k;
        }
        
        System.out.println("Indegree dari vertex " +source+ " : " +totalIn);
        System.out.println("Outdegree dari vertex " +source+ " : " +totalOut);
        System.out.println("degree vertex " +source+ " : " +(totalIn+totalOut));
        }
    }
    
    public void removeEdge(int source, int destination)throws Exception{
        for (int i = 0; i < vertex.length; i++){
            if(i == destination){
                list[source].remove(destination);
            }
        }
    }
    
    public void removeAllEdges(){
        for(int i = 0; i < vertex.length; i++){
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }
    
    public void printGraph() throws Exception{
        for(int i = 0; i < vertex.length; i++){
            if(list[i].size() > 0){
                System.out.print("Vertex " +i+ " terhubung dengan : ");
                for(int j = 0; j < list[i].size(); j++){
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println("");
            }
        }
        System.out.println(" ");
    }
    
}

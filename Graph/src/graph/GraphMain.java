package graph;
import java.util.Scanner;
/**
 *
 * @author sabil
 */
public class GraphMain {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah vertex: ");
        String[] vertexs = new String[sc.nextInt()];
        sc.nextLine();
        for(int i = 0; i< vertexs.length; i++){
            System.out.print("Masukkan data vertex ke-" + i + " : ");
            vertexs[i] = sc.nextLine();
        }
        Graph<String> graph = new Graph<String>(vertexs);
        System.out.print("Masukkan jumlah Edge: ");
        int edges = sc.nextInt();
        System.out.println("Jenis graph yang dapat dipilih :");
        System.out.println("\t1. Directed");
        System.out.println("\t2. Undirected");
        System.out.print("Masukkan jenis graph (1/2) : ");
        graph.directed = (sc.nextInt() == 1) ? true : false;
        System.out.println("Masukkan Edge: <to><from>");
        for(int i = 0; i< edges; i++){
            graph.addEdge(sc.nextInt(), sc.nextInt());
        }
        graph.printGraph();
        graph.degree(2);
        sc.close();
    }
}

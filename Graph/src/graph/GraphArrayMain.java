package graph;
import java.util.Scanner;
/**
 *
 * @author sabil
 */
public class GraphArrayMain {
    public static void main(String[] args){
        int v, e, count = 1, to = 0, from = 0;
        Scanner sc = new Scanner(System.in);
        GraphArray graph;
        try{
            System.out.print("Masukkan jumlah vertices : ");
            v = sc.nextInt();
            System.out.print("Masukkan jumlah edges : ");
            e = sc.nextInt();
            
            String[] vertexs = new String[v + 1]; 
            sc.nextLine();
            for (int i = 1; i <= v; i++) {
                System.out.print("Masukkan data vertex ke-" + i + " : ");
                vertexs[i] = sc.nextLine();
            }
            graph = new GraphArray<String>(vertexs);
            
            System.out.println("Masukkan edges : <to> <from>");
            while(count <= e){
                to = sc.nextInt();
                from = sc.nextInt();
                
                graph.makeEdge(to, from, 1);
                count++;
            }
            System.out.println("Array 2D sebagai representasi graph sbb: ");
            System.out.print(" ");
            for(int i = 0; i <= v; i++){
                System.out.print(i + " ");
            }
            System.out.println();
            
            for(int i = 1; i <= v; i++){
                System.out.print(i + " ");
                for(int j = 1; j <= v; j++){
                    System.out.print(graph.getEdge(i, j) + " ");
                }
                System.out.println();
            }
        }catch(Exception E){
            System.out.println("Error, Silahkan cek kembali\n" + E.getMessage());
        }
        sc.close();
    }
}

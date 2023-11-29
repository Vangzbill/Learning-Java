package minggu11.latihan4;

/**
 *
 * @author sabil
 */
public class Node {
    Mahasiswa data;
    Node next;
    
    public Node(Mahasiswa nilai, Node berikutnya){
        this.data=nilai;
        this.next=berikutnya;
    }
}

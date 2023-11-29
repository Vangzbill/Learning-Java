package uas;

/**
 *
 * @author sabil
 */
public class Node_24 {
    Kendaraan_24 data;
    Pajak_24 pajak;
    Node_24 prev, next;
    
    public Node_24(Node_24 prev, Kendaraan_24 data, Pajak_24 pajak, Node_24 next){
        this.prev = prev;
        this.data = data;
        this.pajak = pajak;
        this.next = next;
    }
}

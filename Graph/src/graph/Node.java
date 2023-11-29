package graph;

/**
 *
 * @author sabil
 */
public class Node {
    int data;
    Node prev, next;
    
    Node(Node prev, int data, Node next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}

package doublelinkedlists.latihan1;

/**
 *
 * @author sabil
 */
public class DoubleLinkedLists {
    Node head;
    int size;
    
    public DoubleLinkedLists(){
        head = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void addFirst(int nomor, String nama){
        if(isEmpty()){
            head = new Node(null, nomor, nama, null);
        } else {
            Node newNode = new Node(null, nomor, nama, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    
    public void addLast(int nomor, String nama){
        if(isEmpty()){
            addFirst(nomor, nama);
        } else {
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            Node newNode = new Node(current, nomor, nama, null);
            current.next = newNode;
            size++;
        }
    }
    
    public void print(){
        if (!isEmpty()){
            Node tmp = head;
            System.out.println("+++++++++++++++++++++++++++");
            System.out.println("Daftar Pengantri Vaksin");
            System.out.println("+++++++++++++++++++++++++++");
            System.out.println("|No\t |" + "Nama\t\t|");
            while (tmp != null){
                System.out.println("|" + tmp.nomor + "\t |" + tmp.nama + "\t\t|");
                tmp = tmp.next;
            }
            System.out.println("Jumlah antrian : " +size);
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }
    
    public void removeFirst() throws Exception {
        if(isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else{
            head = head.next;
            head.prev = null;
            size--;
        }
    }
}

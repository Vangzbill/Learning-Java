package uas;

/**
 *
 * @author sabil
 */
public class DoubleLinkedLists_24 {
    Node_24 head;
    int size;
    
    public DoubleLinkedLists_24(){
        head = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void addFirst(Kendaraan_24 data, Pajak_24 pajak){
        if(isEmpty()){
            head = new Node_24(null, data, pajak, null);
        } else {
            Node_24 newNode = new Node_24(null, data, pajak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    
    public void addLast(Kendaraan_24 data, Pajak_24 pajak){
        if(isEmpty()){
            addFirst(data, pajak);
        } else {
            Node_24 current = head;
            while (current.next != null){
                current = current.next;
            }
            Node_24 newNode = new Node_24(current, data, pajak, null);
            current.next = newNode;
            size++;
        }
    }
      
    public int size(){
        return size;
    }
    
    public void printKendaraan(){
        if (!isEmpty()){
            Node_24 tmp = head;
            System.out.println("=======================");
            System.out.println("Daftar Kendaraan");
            System.out.println("=======================");
            System.out.println("|TNKB\t|Nama\t|Jenis\t|CC\t|Tahun");
            while (tmp != null){
                System.out.println(tmp.data.TNKB + "\t" + tmp.data.nama + "\t" + tmp.data.jenis + "\t" + tmp.data.cc + "\t" + tmp.data.tahun);
                tmp = tmp.next;
            }
            System.out.println("==========================");
        } else {
            System.out.println("Daftar Kosong");
        }
    }
    
    public void asc(){
        Node_24 current = null, index = null;
        Pajak_24 temp;
        if (head == null) {
            return;
        } else {
            for (current = head; current.next != null; current = current.next) {
                for (index = current.next; index != null; index = index.next) {
                    if (current.pajak.nominal.compareTo(index.pajak.nominal)>0) {
                        temp = current.pajak;
                        current.pajak = index.pajak;
                        index.pajak = temp;
                    }
                }
            }
        }
    }
}

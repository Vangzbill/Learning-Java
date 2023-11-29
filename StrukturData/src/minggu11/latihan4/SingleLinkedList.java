package minggu11.latihan4;

/**
 *
 * @author sabil
 */
public class SingleLinkedList {
    Node head;
    Node tail;
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void addLast(Mahasiswa input){
        Node ndInput = new Node(input,null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            head = ndInput;
        }
    }
    
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Data antrian kosong");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }
    
    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.print("Isi Linked List: ");
            int i = 1;
            while (tmp != null) {
                System.out.println("Antrian ke-" + i + " : " + tmp.data.nim + "\t" + tmp.data.nama + "\t" + tmp.data.absen + "\t" + tmp.data.ipk);
                tmp = tmp.next;
                i++;
            }
        } else {
            System.out.println("Data antrian kosong");
        }
    }
    
    public void peek() {
        System.out.println("Antrian terdepan : " + head.data.nim + "\t" + head.data.nama + "\t" + head.data.absen + "\t" + head.data.ipk);
    }
    
    public void peekRear() {
        System.out.println("Antrian terakhir : " + tail.data.nim + "\t" + tail.data.nama + "\t" + tail.data.absen + "\t" + tail.data.ipk);
    }

    public Mahasiswa getData(int index) {
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
    
    public int indoxOf(int key) {
        Node tmp = head;
        int index = 0;
        while (tmp.next != null && tmp.data.nim != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp.data.nim != key) {
            return -1;
        } else {
            return index;
        }
    }
    
    
}

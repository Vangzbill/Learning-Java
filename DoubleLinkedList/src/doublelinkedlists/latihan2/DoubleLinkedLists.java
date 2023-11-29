package doublelinkedlists.latihan2;

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
    
    public void addFirst(Film data){
        if(isEmpty()){
            head = new Node(null, data, null);
        } else {
            Node newNode = new Node(null, data, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    
    public void addLast(Film data){
        if(isEmpty()){
            addFirst(data);
        } else {
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            Node newNode = new Node(current, data, null);
            current.next = newNode;
            size++;
        }
    }
    
    public void add(Film data, int index)throws Exception{
        if(isEmpty()) {
            addFirst(data);
        } else if(index < 0 || index > size){
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node current = head;
            int i = 0;
            while(i < index){
                current = current.next;
                i++;
            }
            if (current.prev == null){
                Node newNode = new Node(null, data, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, data, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    
    public int size(){
        return size;
    }
    
    public void clear(){
        head = null;
        size = 0;
    }
    
    public void print(){
        if (!isEmpty()){
            Node tmp = head;
            System.out.println("Cetak Data");
            while (tmp != null){
                System.out.println("ID Film\t\t : " +tmp.data.id);
                System.out.println("Judul Film\t : " +tmp.data.judul);
                System.out.println("Rating\t\t : " +tmp.data.rating);
                tmp = tmp.next;
            }
            System.out.println("==========================");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }
    
    public void removeFirst() throws Exception {
        if(isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1){
            removeLast();
        } else{
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    
    public void removeLast() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if(head.next == null){
            head = null;
            size--;
            return;
        }
        Node current = head;
        while(current.next.next != null) { 
            current = current.next;
        }
        current.next = null;
        size--;
    }
    
    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0){
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index){
                current = current.next;
                i++;
            }
            if(current.next == null){
                current.prev.next = null;
            } else if (current.prev == null){
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }
    
    public void get(int idx) throws Exception {
        if(isEmpty()) {
            throw new Exception ("Nilai indeks di luar batas!");
        }
        Node tmp = head;
        int i =0;
        for (; i < size; i++){
            if(tmp.data.id == idx)break;
            tmp = tmp.next;
        }
        System.out.println("Data ID Film " + idx +  " berada di Node ke-" + i);
        System.out.println("IDENTITAS : ");
        System.out.println("ID Film\t : " + tmp.data.id);
        System.out.println("Judul\t : " + tmp.data.judul);
        System.out.println("Rating\t : " + tmp.data.rating);
        System.out.println("=================================");
    }
    
    public void desc(){
        Node current = head;
        Node index = null;
        if(head == null){
            return;
        }else {
            while (current != null){
                index = current.next;
                while(index != null){
                    if(current.data.rating < index.data.rating) {
                        Film tmp = current.data;
                        current.data = index.data;
                        index.data = tmp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }
}

package minggu11.latihan2;

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
    
    public void print(){
        if(!isEmpty()){
            Node tmp = head;
            System.out.print("Isi Linked List:\t");
                while(tmp != null){
                    System.out.print(tmp.data + "\t");
                    tmp = tmp.next;
                }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }
        
    public void addFirst(char input){
        Node ndInput = new Node(input,null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }
    
    public void addLast(char input){
        Node ndInput = new Node(input,null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(int key, char input){
        Node ndInput = new Node(input,null);
        Node temp = head;
        do {
            if(temp.data == key){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next == null) tail=ndInput;
                break;
            }
            temp = temp.next;
        }while(temp != null);
    }
    
    public void insertBefore(int key, char input){
        if(head.data == key){
            addFirst(input);
        } else {
            Node temp = head;
            while (temp != null) {
                if (temp.next.data == key) {
                    temp.next = new Node(input, temp.next);
                    break;
                }
                temp = temp.next;
            }
        }
    }

}

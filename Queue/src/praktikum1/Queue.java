package praktikum1;

public class Queue {
    int[] data;
    int front;
    int rear;
    int size;
    int max;
    
    public Queue(int n){
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }
    
    public boolean IsEmpty(){
        if(size == 0){
            return true;
        }else {
            return false;
        }
    }
    
    public boolean IsFull(){
        if(size == max){
            return true;
        }else {
            return false;
        }
    }
    
    public void peek(){
        if(!IsEmpty()){
            System.out.println("Elemen terdepan : " +data[front]);
        }else {
            System.out.println("Queue masih kosong");
        }
    }
    
    public void print(){
        if(IsEmpty()){
           System.out.println("Queue masih kosong");
        }else {
            int i = front;
            while (i != rear){
                System.out.print(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen = " +size);
        }
    }
    
    public void clear(){
        if(!IsEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Queue sudah penuh");
        }else {
            System.out.println("Queue masih penuh");
        }
    }
    
    public void Enqueue(int dt){
        if(IsFull()){
            System.out.println("Queue sudah penuh");
        }else {
            if (IsEmpty()){
                front = rear = 0;
            }else {
                if (rear == max -1){
                    rear = 0;
                }else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }
    
    public int Dequeue(){
        int dt = 0;
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
        }else {
            dt = data[front];
            size--;
            if(IsEmpty()){
                front = rear = -1;
            }else {
                if(front == max -1){
                    front = 0;
                }else {
                    front++;
                }
            }
        }
        return dt;
    }
    
    public void peekPosition(int cari){
        if(!IsEmpty()){
            int idxPos = -1;
            for (int i = 0; i < data.length; i++) {
                if (data[i] == cari) {
                    idxPos = i;
                    break;
                }
            }
                if (idxPos == -1)
                    System.out.println("Nilai yang dicari tidak ada dalam Queue");
                else
                    System.out.println("Posisi " + cari + " berada di index ke-" + idxPos);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekAt(int idxPos){
        if (!IsEmpty()) {
            boolean isFound = false;
            int i = front;
            for (; i != rear; i = (i + 1) % max) {
                if (idxPos == i) isFound = true;
            }
                if (idxPos == i) isFound = true;
            if (isFound)
                System.out.println("Pada Index ke-" + idxPos + " terdapat nilai " + data[idxPos]);
            else
                System.out.println("Index ke-" + idxPos + " kosong");
        } else {
            System.out.println("Queue masih kosong");
        }
    }
}



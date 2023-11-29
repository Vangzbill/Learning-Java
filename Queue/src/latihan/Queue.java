package latihan;

public class Queue {
    Mahasiswa[] antrian;
    int front;
    int rear;
    int size;
    int max;
    
    public Queue(int n){
        max = n;
        antrian = new Mahasiswa[max];
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
            System.out.println("Antrian terdepan: " + antrian[front].nim + " " + antrian[front].nama + " " + antrian[front].absen + " " + antrian[front].ipk);
        }else {
            System.out.println("Queue masih kosong");
        }
    }
    
    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("Antrian terakhir: " + antrian[rear].nim + " " + antrian[rear].nama + " " + antrian[rear].absen + " " + antrian[rear].ipk);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    
    public void print(){
        if(IsEmpty()){
           System.out.println("Queue masih kosong");
        }else {
            int i = front;
            while (i != rear){
                System.out.println(antrian[i].nim + " " + antrian[i].nama + " " + antrian[i].absen + " " + antrian[i].ipk);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nim + " " + antrian[i].nama + " " + antrian[i].absen + " " + antrian[i].ipk);
            System.out.println("Jumlah elemen = " +size);
        }
    }
    
    public void clear(){
        if(!IsEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Queue sudah kosong");
        }else {
            System.out.println("Queue masih penuh");
        }
    }
    
    public void Enqueue(Mahasiswa antri){
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
            antrian[rear] = antri;
            size++;
        }
    }
    
    public Mahasiswa Dequeue(){
        Mahasiswa dtHapus = new Mahasiswa();
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
        }else {
            dtHapus = antrian[front];
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
        return dtHapus;
    }
    
    public void peekPosition(String nim) {
        if (!IsEmpty()) {
        boolean isFound = false;
        int i = front;
        for (; i != rear; i = (i + 1) % max) {
            if (antrian[i].nim.equals(nim)) {
                isFound = true;
                break;
            }
        }
        if (antrian[i].nim.equals(nim)) isFound = true;
        if (isFound){
            System.out.println("Mahasiswa dengan nim " + nim + " ada di posisi " + i);
        } else {
            System.out.println("Mahasiswa dengan nim " + nim + " tidak ada");
        }
        } else {
            System.out.println("Antrian masih kosong");
        }
    }
    
    public void printMahasiswa(int posisi) {
        if (!IsEmpty()) {
        boolean isFound = false;
        int i = front;
        for (; i != rear; i = (i + 1) % max) {
            if (i == posisi) {
                isFound = true;
                break;
            }
        }
        if (i == posisi) isFound = true;
        if (isFound){
            System.out.println(antrian[posisi].nim + " " + antrian[posisi].nama + " " + antrian[posisi].absen + " " + antrian[posisi].ipk);
        } else {
            System.out.println("Mahasiswa dengan posisi " + posisi + " tidak ada");
        }
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

}

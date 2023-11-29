package praktikum1;

public class Stack {
    int size ;
    int top;
    Pakaian data[];
    
    public Stack(int size){
        this.size = size;
        data = new Pakaian[size];
        top = -1;
    }
    
    public boolean isempty(){
        if (top == -1){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean isfull(){
        if (top == size - 1){
            return true;
        }else{
            return false;
        }
    }
    
    public void push(Pakaian pkn){
        if (!isfull()){
            top++;
            data[top] = pkn;
        }else{
            System.out.println("Isi Stack Penuh!");
        }
    }
    
    public void pop (){
        if (!isempty()){
            Pakaian x = data[top];
            top--;
            System.out.println("Data yang keluar: " + x.jenis + " " + x.warna + " " + x.merk + " " + x.ukuran + " " + x.harga);
        }else{
            System.out.println("Stack masih kosong");
        }
    }
    
    public void peek(){
        System.out.println("Elemen teratas: " + data[top].jenis + " " + data[top].warna + " " + data[top].merk + " " + data[top] + " " + data[top].harga);
    }
    
    public void print(){
        System.out.println("Isi Stack: ");
        for (int i = top; i>=0; i--){
            System.out.println(data[i].jenis + " " + data[i].warna + " " + data[i].merk + " " + data[i].ukuran + " " + data[i].harga + " " );
        }
        System.out.println("");
    }
    
    public void clear(){
        if (!isempty()){
            for (int i = top; i >=0; i--){
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        }else {
            System.out.println("Stack masih kosong");
        }
    }
    
    public void getMin() {
        if (!isempty()) {
            double hargaMin = 9999999;
            int idxMin = 0;
            for (int i = top; i >= 0; i--) {
                if (data[i].harga < hargaMin) {
                    hargaMin = data[i].harga;
                    idxMin = i;
                }
            }
            System.out.println("Harga pakaian terkecil: " + data[idxMin].jenis + " " + data[idxMin].warna + " " + data[idxMin].merk + " " + data[idxMin].ukuran + " " + data[idxMin].harga);
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    
}

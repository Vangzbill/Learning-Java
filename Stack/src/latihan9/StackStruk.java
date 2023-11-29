package latihan9;

public class StackStruk {
    int size;
    int top;
    StrukBlnja[] data;
    
    public StackStruk(int size) {
        this.size = size;
        data = new StrukBlnja[size];
        top = -1;
    }
    
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }
    
    public void push(StrukBlnja struk) {
        if (!isFull()) {
            top++;
            data[top] = struk;
        } else {
            System.out.println("Isi stack penuh");
        }
    }
    
    public void pop() {
        if (!isEmpty()) {
            StrukBlnja s = data[top];
            top--;
            System.out.println("Data yang keluar: " + s.noTransaksi + " " +s.tglBeli + " " + s.jmlBarang + " " + s.totalHrg);
        } else {
            System.out.println("Stack masih kosong");
        }
    }
    
    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen teratas: " + data[top].noTransaksi + " " + data[top].tglBeli + " " + data[top].jmlBarang + " " + data[top].totalHrg);
        } else {
            System.out.println("Stack masih kosong");
        }
    }
    
    public void print() {
        System.out.println("Isi stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i].noTransaksi + " " + data[i].tglBeli + " " + data[i].jmlBarang + " " + data[i].totalHrg);
        }
        System.out.println();
    }
    
    public void clear() {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Stack masih kosong");
        }
    }
}

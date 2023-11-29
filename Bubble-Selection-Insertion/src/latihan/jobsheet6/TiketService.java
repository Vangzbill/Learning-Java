package latihan.jobsheet6;

public class TiketService {
    Tiket tiket[] = new Tiket[6]; 
    int idx; 

    void tambah(Tiket m) { 
        if (idx < tiket.length) { 
            tiket[idx] = m; 
            idx++; 
        } else { 
            System.out.println("Data Sudah Penuh!!"); 
        } 
    }
    
    void tampil() { 
        for (Tiket tik : tiket) { 
        tik.tampil(); 
        } 
    }
    
    void bubbleSort() {
        for (int i = 0; i < tiket.length - 1; i++) {
            for (int j = 0; j < tiket.length - i - 1; j++) {
                if (tiket[j + 1].harga < tiket[j].harga) {
                Tiket temp = tiket[j + 1];
                tiket[j + 1] = tiket[j];
                tiket[j] = temp;
                }
            }
        }
    }
    
    void selectionSort() {
        for (int i = 0; i < tiket.length - 1; i++) {
            int idMin = i;
            for (int j = i + 1; j < tiket.length; j++) {
                if (tiket[j].harga < tiket[idMin].harga) {
                idMin = j;
            }
        }
        Tiket temp = tiket[idMin];
        tiket[idMin] = tiket[i];
        tiket[i] = temp;
    }
 }

    

}

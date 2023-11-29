package minggu7.Latihan;

public class PencarianMhs {
    MahasiswaMain data = new MahasiswaMain();
    Mahasiswa listMhs[] = new Mahasiswa[MahasiswaMain.jumData];
    int idx;

    void tambah(Mahasiswa m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!!");
        }
    }

    void tampil() {
        for (Mahasiswa m : listMhs) {
            m.tampil();
            System.out.println("--------------------------");
        }
    }
 
    public int FindSeqSearch(String cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            posisi = j;
            break;
        }return posisi;
    }
   
    public void tampilPosisi(String x, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data : " + x + " tidak ditemukan");
        }
    }
   
    public void tampilData(String x, int pos) {
        if (pos != -1) {
            System.out.println("Nim\t : " + listMhs[pos].nim);
            System.out.println("Nama\t : " + x);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("IPK\t : " + listMhs[pos].ipk);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }
   
    void selectionSorting() {
        for (int i = 0; i < listMhs.length-1; i++) {
            int x = i;
            for (int j = i+1; j < listMhs.length-1; j++) {
                if (listMhs[x].nama.compareTo(listMhs[j].nama) > 0) {
                    x = j;
                }
            }
            Mahasiswa y = listMhs[x];
            listMhs[x] = listMhs[i];
            listMhs[i] = y;
        }
    }
   
}
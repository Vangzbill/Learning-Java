package minggu8;

public class PencarianTinggi {
    TinggiMain data = new TinggiMain();
    Tinggi dataTinggi[] = new Tinggi[TinggiMain.jumlah];
    int idx;
    int jumlahTim = 0;
    
    void tambah(Tinggi t) {
        if (idx < dataTinggi.length) {
            dataTinggi[idx] = t;
            idx++;
        } else {
            System.out.println("Jumlah Data sudah penuh!!!");
        }
    }

    void tampil() {
        for (Tinggi t : dataTinggi) {
            t.tampil();
            System.out.println("==========================");
        }
    }
    
    void selectionSort(){
        for(int i=0; i<dataTinggi.length-1; i++){
            int idxMax = i;
            for(int j=i+1; j<dataTinggi.length; j++){
                if(dataTinggi[j].tinggi>dataTinggi[idxMax].tinggi){
                    idxMax=j;
                }
            }
            Tinggi tmp = dataTinggi[idxMax];
            dataTinggi[idxMax] = dataTinggi[i];
            dataTinggi[i] = tmp;
        }
    }
    
    public void TampilTim(){
        for(int i = 0; i < dataTinggi.length; i++){
            if(dataTinggi[i].tinggi > 170){
                jumlahTim++;
                System.out.println("Siswa ke-" +jumlahTim);
                dataTinggi[i].tampil();
            }
        }
    }
    
    public void TampilJumlah(){
        System.out.println("==============================");
        System.out.println("Jumlah yang dijadikan tim :" +jumlahTim);
    }
    
}

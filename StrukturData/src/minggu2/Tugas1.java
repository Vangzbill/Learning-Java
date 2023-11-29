package minggu2;

public class Tugas1 {
    String nama;
    int hargaSatuan, jumlah;
    
    int hitungHargaTotal(){
        int total = hargaSatuan * jumlah;
        return total;
    }
    
    int hitungDiskon(int hargaTotal){
        int diskon = 0;
        if(hargaTotal > 100000){
           diskon = hargaTotal / 100 * 10;
        }else if (hargaTotal >= 50000 && hargaTotal <= 100000){
           diskon = hargaTotal / 100 * 5; 
        }return diskon;
    }
    
    int hitungHargaBayar(int hargaTotal, int diskon) {
        int bayar = hargaTotal-diskon;
        return bayar;
    }
}

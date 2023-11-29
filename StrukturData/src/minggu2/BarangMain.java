package minggu2;

public class BarangMain {
    public static void main(String[] args) {
        Barang b1= new Barang();
        b1.namaBarang = "Corsair 2 GB";
        b1.jenisBarang = "DDR";
        b1.hargaSatuan = 250000;
        b1.stok = 10;
        b1.tambahStok(1);
        b1.kurangStok(3);
        b1.tampilBarang();
        int hargaTotal = b1.hitungHargaTotal(4);
        System.out.println("Harga 4 buah = "+hargaTotal);
        Barang b2= new Barang("Logitech","Wireless Mouse",25,150000);
        b2.tampilBarang();
        Barang b3= new Barang("V-GEN","Earphone",30,30000);
        b3.tampilBarang();
    }
}


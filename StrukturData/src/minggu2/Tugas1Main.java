package minggu2;

public class Tugas1Main {
    public static void main(String[] args) {

        Tugas1 barang1 = new Tugas1();
        barang1.nama = "V-GEN Earphone";
        barang1.jumlah = 2;
        barang1.hargaSatuan = 30000;
        
        int hargaTotal = barang1.hitungHargaTotal();
        int diskon = barang1.hitungDiskon(hargaTotal);
        int hargaAkhir = barang1.hitungHargaBayar(hargaTotal, diskon);

        System.out.println("Barang yg dibeli :  " +barang1.nama);
        System.out.println("Harga barang :  " +barang1.hargaSatuan);
        System.out.println("Jumlah :  " +barang1.jumlah);
        System.out.println("====================");
        System.out.println("====================");
        System.out.println("Total bayar : " + hargaAkhir);

    }
}

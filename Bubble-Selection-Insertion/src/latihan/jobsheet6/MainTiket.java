package latihan.jobsheet6;

public class MainTiket {
    public static void main(String[] args) { 
    TiketService daftar = new TiketService(); 
    Tiket m1 = new Tiket("Citilink", 1100000, "Makassar", "Surabaya"); 
    Tiket m2 = new Tiket("Lion Air", 1300000, "Bandung", "Surabaya"); 
    Tiket m3 = new Tiket("Garuda Indonesia", 1000000, "Pontianak", "Bali"); 
    Tiket m4 = new Tiket("Air Asia", 900000, "Jakarta", "Medan"); 
    Tiket m5 = new Tiket("Sriwijaya Air", 1350000, "Palembang", "Jakarta"); 
    Tiket m6 = new Tiket("Batik Air", 1200000, "Semarang", "Pekanbaru"); 

    daftar.tambah(m1); 
    daftar.tambah(m2); 
    daftar.tambah(m3); 
    daftar.tambah(m4);
    daftar.tambah(m5);
    daftar.tambah(m6);
    
    System.out.println("=================================================="); 
    System.out.println("************Data Tiket Sebelum Sorting************"); 
    System.out.println("=================================================="); 
    daftar.tampil(); 
    System.out.println();
    
    System.out.println("Sorting dari Harga Termurah ke Harga Tertinggi : "); 
    System.out.println("\n-------------------------------Bubble Sort-------------------------------"); 
    daftar.bubbleSort(); 
    daftar.tampil(); 
    System.out.println("---------------------------Selection Sort---------------------------"); 
    daftar.selectionSort(); 
    daftar.tampil();

    }
}

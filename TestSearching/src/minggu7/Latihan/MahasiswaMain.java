package minggu7.Latihan;
import java.util.Scanner;

public class MahasiswaMain {
    static int jumData;
    public static int tambahJumArray(int n) {

    Scanner s = new Scanner(System.in);
    Scanner s1 = new Scanner(System.in);
   
    PencarianMhs data = new PencarianMhs();
    String cari;
   
    System.out.println(" ");
    System.out.println("--------------------------------------------");
    System.out.println("Masukkan data Mahasiswa secara urut dari Nim");
    System.out.println("--------------------------------------------");
   
    for (int i = 0; i < n; i++) {
        System.out.print("Nim : ");
        int nim = s.nextInt();
        System.out.print("Nama : ");
        String nama = s1.nextLine();
        System.out.print("Umur : ");
        int umur = s.nextInt();
        System.out.print("IPK : ");
        double ipk = s.nextDouble();
        System.out.println("---------------------------");
        Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
        data.tambah(m);
    }

    System.out.println("\n-----------------------------");
    System.out.println("Data keseluruhan Mahasiswa : ");
    data.selectionSorting();
    data.tampil();

    System.out.println("\n-------------------------------------");
    System.out.println("-------------------------------------");
    System.out.println("Pencarian data : ");
    System.out.println("Masukkan Nama Mahasiswa yang dicari : ");
    System.out.print("Nama : ");
    cari = s1.nextLine();

    System.out.println("-------------------------");
    System.out.println("Menggunakan Sequential Search");
    int posisi = data.FindSeqSearch(cari);
    data.tampilPosisi(cari, posisi);
    data.tampilData(cari, posisi);
    return n;
    
    }

    public static void main(String[] args) {
        Scanner inputN = new Scanner(System.in);

        System.out.println("\n-------------------------------------");
        System.out.print("Masukkan Jumlah Data Mahasiswa >> ");
        jumData = inputN.nextInt();
        System.out.println("-------------------------------------");

        tambahJumArray(jumData);
    }
}

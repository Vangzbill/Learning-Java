package minggu8;
import java.util.Scanner;

public class TinggiMain {
   static int jumlah;
    public static int tambahJumArray(int n) {

    Scanner s = new Scanner(System.in);
    Scanner s1 = new Scanner(System.in);
   
    PencarianTinggi data = new PencarianTinggi();
    System.out.println("\n--------------------------------------------");
    System.out.println("Masukkan data Tinggi Paskibra :");
    System.out.println("--------------------------------------------");
   
    for (int i = 0; i < n; i++) {
        System.out.print("Nama : ");
        String nama = s1.nextLine();
        System.out.print("Tinggi : ");
        int tinggi = s.nextInt();
        System.out.println("---------------------------");
        Tinggi t = new Tinggi(nama, tinggi);
        data.tambah(t);
    }

    System.out.println("\n============================");
    System.out.println("Data urutan tinggi Paskibra : ");
    data.selectionSort();
    data.tampil();
    
    System.out.println("\n============================");
    System.out.println("Anggota yang dijadikan tim khusus :");
    data.TampilTim();
    data.TampilJumlah();
    return n;
    
    }

    public static void main(String[] args) {
        Scanner s2 = new Scanner(System.in);

        System.out.println("\n-------------------------------------");
        System.out.print("Masukkan Jumlah Data Paskibra : ");
        jumlah = s2.nextInt();
        System.out.println("-------------------------------------");

        tambahJumArray(jumlah);
    }
}

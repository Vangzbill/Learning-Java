package minggu7;
import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        
        PencarianMhs data = new PencarianMhs();
        int jumMhs = 5;
        
        System.out.println("-------------------------------------------------");
        System.out.println("Masukkan data mahasiswa secara Urut dari Nim Terkecil");
        for(int i = 0; i < jumMhs; i++){
            System.out.println("---------------------");
            System.out.print("Nim\t : " );
            int nim = s.nextInt();
            System.out.print("Nama\t : ");
            String nama = s1.nextLine();
            System.out.print("Umur\t : " );
            int umur = s.nextInt();
            System.out.print("IPK\t : " );
            double ipk = s.nextDouble();
        
            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }
        
        System.out.println("-------------------------------------------------");
        System.out.println("Data Keseluruhan Mahasiswa : ");
        data.tampil();
        
        System.out.println("_________________________________________________");
        System.out.println("_________________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Nim mahasiswa yang dicari : ");
        System.out.print("NIM : ");
        int cari = s.nextInt();
        System.out.println("menggunakan Sequential Search");
        int posisi = data.FindSeqSearch(cari);
        
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);
        
        System.out.println("======================================");
        System.out.println("menggunakan binary search");
        posisi = data.FindBinarySearch(cari, 0, jumMhs-1);
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);
    }
}

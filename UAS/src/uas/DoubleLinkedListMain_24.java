package uas;
import java.util.Scanner;
/**
 *
 * @author sabil
 */
public class DoubleLinkedListMain_24 {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        
        DoubleLinkedLists_24 dll = new DoubleLinkedLists_24();
        int menu = 0;
        System.out.println("===QUIS 2 PRAKTIKUM ALGORITMA STRUKTUR DATA===");
        System.out.println("Nama\t : Sabilla Luthfi Rahmadhan");
        System.out.println("NIM\t : 2141720122");
        System.out.println("Absen\t : 24");
        System.out.println("==============================================");
        System.out.println("System Perhitungan Pajak");
        do {
            System.out.println("===============================");
            System.out.println("Menu");
            System.out.println("===============================");
            System.out.println("1. Tambah Data");
            System.out.println("2. Hitung Pajak");
            System.out.println("3. Tampilkan Transaksi");
            System.out.println("4. Pengurutan Transaksi");
            System.out.println("5. Hitung Total Pendapatan");
            System.out.println("6. Keluar");
            System.out.println("===============================");
            System.out.print("Pilih menu : ");
            menu = sc.nextInt();
            sc.nextLine();
            
            switch (menu) {
                case 1:
                    System.out.print("Masukkan data : ");
                    System.out.print("Masukkan TNKB : ");
                    String TNKB = sc.nextLine();
                    System.out.print("Masukkan Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Jenis : ");
                    String jenis = sc.nextLine();
                    System.out.print("Masukkan CC : ");
                    int cc = sc.nextInt();
                    System.out.print("Masukkan Tahun : ");
                    int tahun = sc.nextInt();
                    System.out.print("Masukkan Tahun Bayar : ");
                    String blnhrsBayar = sc.nextLine();
                    
                    System.out.print("Masukkan Kode : ");
                    int kode = sc.nextInt();
                    System.out.print("Masukkan Nominal : ");
                    int nominal = sc.nextInt();
                    System.out.print("Masukkan Denda : ");
                    int denda = sc.nextInt();
                    System.out.print("Masukkan bulanBayar : ");
                    String bulanBayar = sc.nextLine();
                    dll.addLast(new Kendaraan_24(TNKB, nama, jenis, cc, tahun, blnhrsBayar),new Pajak_24(kode, nominal, denda, bulanBayar));
                    break;
                case 2:
                    dll.printKendaraan();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Program sudah dijalankan, terimakasih");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
        } while (menu != 0 && menu <= 6);
            sc.close();
    }
}

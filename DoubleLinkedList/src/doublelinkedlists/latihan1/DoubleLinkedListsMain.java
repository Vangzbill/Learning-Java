package doublelinkedlists.latihan1;
import java.util.Scanner;

/**
 *
 * @author sabil
 */
public class DoubleLinkedListsMain {
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        DoubleLinkedLists dll = new DoubleLinkedLists();
        int menu = 0;
        do {
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EKSTRAVAGANZA");
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.print("Pilih menu : ");
            menu = sc.nextInt();
            sc.nextLine();
            
            switch (menu) {
                case 1:
                    System.out.println("Masukkan data pengantri : ");
                    System.out.print("Nomor : ");
                    int nomor = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    
                    dll.addLast(nomor, nama);
                    break;
                case 2:
                    dll.removeFirst();
                    break;
                case 3:
                    dll.print();
                    break;
                case 4:
                    System.out.println("Progam telah selesai dijalankan, terimakasih");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
        } while (menu != 0 && menu <= 4);
            sc.close();
    }
}

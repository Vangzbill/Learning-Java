package doublelinkedlists.latihan2;
import java.util.Scanner;

/**
 *
 * @author sabil
 */
public class DoubleLinkedListsMain {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        
        DoubleLinkedLists dll = new DoubleLinkedLists();
        int menu = 0;
        int id;
        String judul;
        double rating;
        do {
            System.out.println("===============================");
            System.out.println("Data Film Layar Lebar");
            System.out.println("===============================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Indeks Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Indeks Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film-DESC");
            System.out.println("10. Keluar");
            System.out.println("===============================");
            System.out.print("Pilih menu : ");
            menu = sc.nextInt();
            sc.nextLine();
            
            switch (menu) {
                case 1:
                    System.out.println("Masukkan data antrian : ");
                    System.out.print("ID Film : ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Judul : ");
                    judul = sc.nextLine();
                    System.out.print("Rating : ");
                    rating = sc.nextDouble();
                    
                    dll.addFirst(new Film(id, judul, rating));
                    break;
                case 2:
                    System.out.println("Masukkan data antrian : ");
                    System.out.print("ID Film : ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Judul : ");
                    judul = sc.nextLine();
                    System.out.print("Rating : ");
                    rating = sc.nextDouble();
                    
                    dll.addLast(new Film(id, judul, rating));
                    break;
                case 3:
                    System.out.println("Masukkan data antrian : ");
                    System.out.print("ID Film : ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Judul : ");
                    judul = sc.nextLine();
                    System.out.print("Rating : ");
                    rating = sc.nextDouble();
                    System.out.print("Masukkan index : ");
                    int index = sc.nextInt();
                    
                    dll.add(new Film(id, judul, rating), index);
                    break;
                case 4:
                    dll.removeFirst();
                    break;
                case 5:
                    dll.removeLast();
                    break;
                case 6:
                    System.out.print("Masukkan index yang ingin dihapus : ");
                    int idx = sc.nextInt();
                    dll.remove(idx);
                    break;
                case 7:
                    dll.print();
                    break;
                case 8:
                    System.out.print("Masukkan ID : ");
                    id = sc.nextInt();
                    dll.get(id);
                    break;
                case 9:
                    dll.desc();
                    dll.print();
                    break;
                case 10:
                    System.out.println("Program sudah dijalankan, terimakasih");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
        } while (menu != 0 && menu <= 10);
            sc.close();
    }
}

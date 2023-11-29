package minggu11.latihan4;
import java.util.Scanner;

/**
 *
 * @author sabil
 */
public class SLLMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        SingleLinkedList linkedList = new SingleLinkedList();
        int menu = 0;
        do {
            System.out.println("Menu antrian : ");
            System.out.println("1. Antrian baru");
            System.out.println("2. Antrian keluar");
            System.out.println("3. Tampilkan semua antrian");
            System.out.println("4. Tampilkan antrian terdepan");
            System.out.println("5. Tampilkan antrian terakhir");
            System.out.println("6. Cari posisi antrian");
            System.out.println("7. Cek posisi antrian");
            System.out.println("-----------------------------");
            System.out.println("-----------------------------");
            System.out.print("Pilih menu : ");
            menu = sc.nextInt();
            sc.nextLine();
            
            switch (menu) {
                case 1:
                    System.out.println("Masukkan data antrian : ");
                    System.out.print("NIM : ");
                    int nim = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Absen : ");
                    int absen = sc.nextInt();
                    System.out.print("IPK : ");
                    double ipk = sc.nextDouble();
                    
                    linkedList.addLast(new Mahasiswa(nim, nama, absen, ipk));
                    break;
                case 2:
                    linkedList.removeFirst();
                    break;
                case 3:
                    linkedList.print();
                    break;
                case 4:
                    linkedList.peek();
                    break;
                case 5:
                    linkedList.peekRear();
                    break;
                case 6:
                    System.out.print("Masukkan NIM : ");
                    int indexFound = linkedList.indoxOf(sc.nextInt());
                    System.out.println("Mahasiswa yang dicari ada diantrian ke-" + (indexFound + 1));
                    break;
                case 7:
                    System.out.print("Masukkan nomor antrian yang ingin di cek : ");
                    Mahasiswa mahasiswaFound = linkedList.getData((sc.nextInt() - 1));
                    System.out.println("Data antrian : " + mahasiswaFound.nim + "\t" + mahasiswaFound.nama + "\t" + mahasiswaFound.absen + "\t" + mahasiswaFound.ipk);
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
        } while (menu != 0 && menu <= 7);
            sc.close();
    }
    
}

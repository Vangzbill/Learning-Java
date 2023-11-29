package latihan;
import java.util.Scanner;

public class QueueMain {
    public static void menu(){
        System.out.println("Masukkan operasi yang diinginkan :");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Peek Rear");
        System.out.println("6. Peek Position");
        System.out.println("7. Print Mahasiswa");
        System.out.println("8. Clear");
        System.out.println("--------------");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int n= sc.nextInt();
        int pilihan;
        
        latihan.Queue q= new latihan.Queue(n);
        
        do {
            menu();
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan data antrian : ");
                    System.out.print("NIM : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Absen : ");
                    int absen = sc.nextInt();
                    System.out.print("IPK : ");
                    double ipk = sc.nextDouble();
                    q.Enqueue(new Mahasiswa(nim, nama, absen, ipk));
                    break;
                case 2:
                    q.Dequeue();
                    break;
                case 3:
                    q.print();
                    break;
                case 4:
                    q.peek();
                    break;
                case 5:
                    q.peekRear();
                    break;
                case 6:
                    System.out.print("Masukkan NIM yang dicari antriannya: ");
                    q.peekPosition(sc.nextLine());
                    break;
                case 7:
                    System.out.print("Masukkan nomor antrian yang ingin di cek : ");
                    q.printMahasiswa(sc.nextInt());
                    break;
                case 8:
                    q.clear();
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
                break;
            }
        } while (pilihan != 0 && pilihan <= 8);
        sc.close();
    }
}


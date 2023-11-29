package minggu3;
import java.util.Scanner;

public class Mahasiswa {
    Scanner sc = new Scanner(System.in); 
    String nama; 
    int nim; 
    char jenisKelamin; 
    double ipk;
    
    void Input() { 
        System.out.print("Masukkan Nama : "); 
        nama = sc.nextLine(); 
        System.out.print("Masukkan NIM : "); 
        nim = sc.nextInt(); 
        System.out.print("Masukkan Jenis Kelamin : "); 
        jenisKelamin = sc.next().charAt(0); 
        System.out.print("Masukkan Nilai IPK : "); 
        ipk = sc.nextDouble(); 
    }
    
    void Output() { 
        System.out.println("Nama : " + nama); 
        System.out.println("NIM : " + nim);    
        System.out.println("Jenis Kelamin : " + jenisKelamin); 
        System.out.println("Nilai IPK : " + ipk); 
    }
}

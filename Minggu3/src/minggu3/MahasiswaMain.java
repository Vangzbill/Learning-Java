package minggu3;
import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah data Mahasiswa : ");
        int x=sc.nextInt();
        Mahasiswa[] mahasiswa = new Mahasiswa[x]; 

    for (int i=0; i<mahasiswa.length; i++) { 
        mahasiswa[i] = new Mahasiswa(); 
        System.out.println("Masukkan data mahasiswa ke-" + (i+1)); 
        mahasiswa[i].Input(); 
        System.out.println(); 
    } 
    System.out.println(); 
    
    for (int i=0; i<mahasiswa.length; i++) { 
        System.out.println("Data Mahasiswa ke-" + (i+1)); 
        mahasiswa[i].Output(); 
    } 
}

}

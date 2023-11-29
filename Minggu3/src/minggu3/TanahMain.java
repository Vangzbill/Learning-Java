package minggu3;
import java.util.Scanner;

public class TanahMain {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int terluas = 0;
        String tanahTerluas = "";
        
        System.out.print("Masukkan jumlah tanah : ");
        int x = sc.nextInt();
        Tanah[] tanah = new Tanah[x];
        System.out.println("========================"); 

        for (int i=0; i<tanah.length; i++) { 
            tanah[i] = new Tanah(); 
            System.out.println("Tanah ke-" + (i+1)); 
            System.out.print("Masukkan Panjang: "); 
            tanah[i].panjang = sc.nextInt(); 
            System.out.print("Masukkan Lebar: "); 
            tanah[i].lebar = sc.nextInt(); 
        } 
        System.out.println("========================"); 

        for (int i=0; i<tanah.length; i++) { 
        System.out.printf("Luas Tanah ke-%d: %d\n", i+1, tanah[i].hitungLuas()); 
            if (tanah[i].hitungLuas() > terluas) { 
            terluas = tanah[i].hitungLuas(); 
            tanahTerluas = "Tanah ke-" + (i+1); 
            } 
        } 
    System.out.println("\nTanah terluas : " + tanahTerluas);
    }
}

package arrayobjects;
import java.util.Scanner;
public class PersegiPanjangMain {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Masukkan panjang array : ");
       int bil = sc.nextInt();
       PersegiPanjang[] ppArray = new PersegiPanjang[bil];
       
       
       
       for(int i = 0; i < bil; i++){
           ppArray[i] = new PersegiPanjang();
           System.out.println("Persegi panjang ke-" + i);
           System.out.print("Masukkan panjang: ");
           ppArray[i].panjang = sc.nextInt();
           System.out.print("Masukkan lebar: ");
           ppArray[i].lebar = sc.nextInt();
       }
       
       for(int i = 0; i < bil; i++){
           System.out.println("Persegi Panjang ke-" + i);
           System.out.println("Persegi Panjang ke-0, panjang: " + ppArray[i].panjang + " lebar: " + ppArray[i].lebar);
       }
       
    }
    
}

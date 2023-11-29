package kuis1;
import java.util.Scanner;

public class TabungMain {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Tabung[] tabung = new Tabung[3];
    double terluas = 0;
    String tabungTerluas = "";
    
    //perulangan untuk menginput nilai atribut
    for (int i=0; i<3; i++) { 
            tabung[i] = new Tabung(); 
            System.out.println("Tabung ke-" + (i+1)); 
            System.out.print("Masukkan Jari-jari: "); 
            tabung[i].jari2 = sc.nextDouble(); 
            System.out.print("Masukkan Tinggi: "); 
            tabung[i].tinggi = sc.nextDouble(); 
            System.out.println("======================");
        } 
    
    //perulangan untuk mencetak dan membandingkan volume tabung
    for (int i=0; i<3; i++) { 
        System.out.printf("Luas Permukaan Tabung ke-%d: %.2f\n", i+1, tabung[i].hitungLuasPTabung());
        System.out.printf("Volume Tabung ke-%d: %.2f\n", i+1, tabung[i].hitungVolume()); 
            if (tabung[i].hitungVolume() > terluas) { 
            terluas = tabung[i].hitungVolume(); 
            tabungTerluas = "Tabung ke-" + (i+1); 
            } 
        } 
    System.out.println("==================================");
    System.out.println("Tabung terluas : " + tabungTerluas);
    }
}

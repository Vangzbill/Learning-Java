import java.util.Scanner;
public class Pemilihan{
    public static void main(String[] args){
    Scanner sabil = new Scanner(System.in);
    int nilaiTugas;
    int nilaiUTS;
    int nilaiUAS;
    double nilaiAkhir;

    System.out.println("Program Menghitung Nilai Akhir");
    System.out.println("==============================");
    System.out.print("Masukkan nilai Tugas : ");
    nilaiTugas = sabil.nextInt();
    System.out.print("Masukkan nilai UTS : ");
    nilaiUTS = sabil.nextInt();
    System.out.print("Masukkan nilai UAS : ");
    nilaiUAS = sabil.nextInt();
    System.out.println("==============================");
    System.out.println("==============================");
    nilaiAkhir = (20/100*nilaiTugas)+(35/100*nilaiUTS)+(45/100*nilaiUAS);
    System.out.println("Nilai AKhir : " +nilaiAkhir);
        if(nilaiAkhir > 80 && nilaiAkhir <= 100){
            System.out.println("Nilai Huruf : A");
        }else if(nilaiAkhir > 73 && nilaiAkhir <= 80){
            System.out.println("Nilai Huruf : B+");
        }else if(nilaiAkhir > 65 && nilaiAkhir <= 73){
            System.out.println("Nilai Huruf : B");
        }else if(nilaiAkhir > 60 && nilaiAkhir <= 65){
            System.out.println("Nilai Huruf : C+");
        }else if(nilaiAkhir > 50 && nilaiAkhir <= 60){
            System.out.println("Nilai Huruf : C");
        }else if(nilaiAkhir > 39 && nilaiAkhir <= 50){
            System.out.println("Nilai Huruf : D");
        }else{
            System.out.println("Nilai Huruf : E");
        }
    System.out.println("==============================");
    System.out.println("==============================");
    if(nilaiAkhir > 50 && nilaiAkhir <= 100){
        System.out.println("SELAMAT LULUS");
    }else{
        System.out.println("ANDA TIDAK LULUS");
    }
    }
}

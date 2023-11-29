package tembakdemo;

public class Tembak {
    private String nama;
    private int jumlahPeluru;
    
    public void setNama(String newValue){
        nama = newValue;
    }
    
    public void tambahPeluru(int increment){
        jumlahPeluru += increment;
    }
    
    public void kurangiPeluru(int decrement){
        jumlahPeluru -= decrement;
    }
    
     public void cetakStatus(){
        System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>>>>");
        System.out.println("Nama\t\t : " +nama);
        System.out.println("Jumlah Peluru\t : " +jumlahPeluru);
    }
}

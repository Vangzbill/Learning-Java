package tembakdemo;

public class TembakDemo {
    public static void main(String[] args){
        Tembak tb1 = new Tembak();
        Sniper tb2 = new Sniper();
        
        tb1.setNama("AK-47");
        tb1.tambahPeluru(12);
        tb1.kurangiPeluru(4);
        tb1.cetakStatus();
        
        tb2.setNama("AWM");
        tb2.tambahPeluru(10);
        tb2.kurangiPeluru(2);
        tb2.gantiScope("2x");
        tb2.setMagazine("Lancer 340Rds");
        tb2.cetakStatus();
    }
}

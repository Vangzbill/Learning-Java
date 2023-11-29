package minggu8;

public class Tinggi {
    String nama;
    int tinggi;
    
    public Tinggi(String nm, int t) {
        nama = nm;
        tinggi = t;
    }
    
    void tampil() {
        System.out.println("Nama : " + nama);
        System.out.println("Tinggi : " + tinggi);
    }
    
}

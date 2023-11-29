package minggu3;

    class Kubus {
    int sisi;
    Kubus(int s) {
    sisi = s;
    }
    int hitungLuasPKubus() {
        return sisi * sisi;
    }
    int hitungVolume() {
        return sisi*sisi*sisi;
    }
}

    class Tabung {
    double jari2;
    double tinggi;
    Tabung(double r, double t) {
    jari2 = r;
    tinggi = t;
    }
    double hitungLuasPTabung() {
        return 3.14*jari2*jari2;
    }
    double hitungVolume() {
        return 3.14*jari2*jari2*tinggi;
    }
    }
    class Balok  {
    int panjang;
    int lebar;
    int tinggi;
    Balok (int p, int l, int t){
    panjang = p;
    lebar = l;
    tinggi = t;
    }
    public int hitungVolume() {
        return panjang * lebar * tinggi;
    }
    public int hitungLuasPBalok() {
        return panjang*lebar;
    }
}       
    
    


package minggu3;

public class KubusMain {
     public static void main(String[] args) { 
        Kubus[] kubus = new Kubus[3]; 
        Tabung[] tabung = new Tabung[3];
        Balok[] balok = new Balok[3];
        
        kubus[0] = new Kubus(8); 
        kubus[1] = new Kubus(15); 
        kubus[2] = new Kubus(20);
        
        tabung[0] = new Tabung(8, 16); 
        tabung[1] = new Tabung(20, 6); 
        tabung[2] = new Tabung(18, 13);
        
        balok[0] = new Balok(14, 10, 5); 
        balok[1] = new Balok(15, 10, 8); 
        balok[2] = new Balok(15, 10, 9);
    
        for (int i=0; i<3; i++) {  
            System.out.println("Kubus ke-" +(i+1)+ " bervolume : " +kubus[i].hitungVolume()+ " dengan luas permukaan : " +kubus[i].hitungLuasPKubus()); 
            System.out.println("Tabung ke-" +(i+1)+ " bervolume : " +tabung[i].hitungVolume()+ " dengan luas permukaan : " +tabung[i].hitungLuasPTabung()); 
            System.out.println("Balok ke-" +(i+1)+ " bervolume : " +balok[i].hitungVolume()+ " dengan luas permukaan : " +balok[i].hitungLuasPBalok());
        } 
    }

}

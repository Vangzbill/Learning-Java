package jamdemo;

public class Jam {
    private String merk, jenisBatrei;
    
    public void addMerk(String newValue){
        merk = newValue;
    }
    
    public void addJenisBatrei(String newValue){
        jenisBatrei = newValue;
    }
    
    public void cetakStatus(){
        System.out.println("=====================");
        System.out.println("Merk\t\t : " +merk);
        System.out.println("Jenis Baterai\t : " +jenisBatrei);
    }
}

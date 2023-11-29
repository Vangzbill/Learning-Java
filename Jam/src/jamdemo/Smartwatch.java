package jamdemo;

public class Smartwatch extends Jam{
    private String oS, fitur;
    
    public void addoS(String newValue){
        oS = newValue;
    }
    
    public void addFitur(String newValue){
        fitur = newValue;
    }
    
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Operating System : " +oS);
        System.out.println("Fitur\t\t : " +fitur);
    }
}

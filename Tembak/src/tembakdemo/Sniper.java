package tembakdemo;

public class Sniper extends Tembak{
    private String scope, magazine;
    
    public void gantiScope(String newValue){
        scope = newValue;
    }
    
    public void setMagazine(String newValue){
        magazine = newValue;
    }
    
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Scope\t\t : " +scope);
        System.out.println("Magazine\t : " +magazine);
    }
}

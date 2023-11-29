package jamdemo;

public class JamDemo {
    public static void main(String[] args){
        Jam jam1 = new Jam();
        Smartwatch jam2 = new Smartwatch();
        
        jam1.addMerk("G-Shock");
        jam1.addJenisBatrei("CR1220");
        jam1.cetakStatus();
        
        jam2.addMerk("Apple");
        jam2.addJenisBatrei("CJ1550");
        jam2.addoS("IoS");
        jam2.addFitur("Olahraga, Audio");
        jam2.cetakStatus();
    }
}

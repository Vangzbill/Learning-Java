package minggu11.latihan3;

/**
 *
 * @author sabil
 */
public class SLLMain {
    public static void main(String[] args){
        SingleLinkedList singLL = new SingleLinkedList();
        singLL.addFirst("Multimedia");
        singLL.print();
        singLL.insertAfter("Multimedia", "Algoritma");
        singLL.print();
        singLL.insertBefore("Algoritma", "Statistika");
        singLL.print();
        singLL.insertAfter("Algoritma", "Matematika");
        singLL.print();
        singLL.addLast("Basis Data");
        singLL.print();
        singLL.insertAfter("Basis Data", "Android");
        singLL.print();
        singLL.insertBefore("Android", "Komputer");
        singLL.print();
        singLL.addLast("Bahasa");
        singLL.print();
    }
}

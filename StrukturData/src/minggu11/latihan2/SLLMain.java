package minggu11.latihan2;

/**
 *
 * @author sabil
 */
public class SLLMain {
    public static void main(String[] args){
        SingleLinkedList singLL = new SingleLinkedList();
        singLL.addFirst('b');
        singLL.print();
        singLL.insertAfter('b', 'c');
        singLL.print();
        singLL.insertBefore('b', 'a');
        singLL.print();
        singLL.insertAfter('c', 'd');
        singLL.print();
        singLL.addLast('e');
        singLL.print();
    }
}
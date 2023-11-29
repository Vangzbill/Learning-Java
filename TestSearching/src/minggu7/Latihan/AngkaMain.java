package minggu7.Latihan;

public class AngkaMain {
    public static void main(String[] args) {
        int[] data = { 12, 17, 2, 1, 70, 50, 90, 17, 2, 90 };
        Angka angka = new Angka(data);
        angka.bubbleSort(); 
        angka.showSorted(); 
        angka.findBinarySearch(data, 0, data.length - 1); 
        System.out.println("Nilai terbesar adalah " + angka.largest); 
        System.out.println("Nilai terbesar yang ditemukan sebanyak " + angka.counter + " kali"); 
        angka.showLargestIdx(); 
    }
}

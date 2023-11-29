import java.util.Scanner;
public class Array{
    public static void Array(String[] Args) {
        Scanner sabil2 = new Scanner(System.in);
        int[][] stok = {
            {10,5,15,7},
            {6,11,9,12},
            {2,10,10,5},
            {5,7,12,9}
        };
        String[] jenisBunga = {"Aglonema","Keladi","Alocasia","Mawar"};
        String[] cabang = {"RoyalGarden1","RoyalGarden2","RoyalGarden3","RoyalGarden4"};
        int stokAglonema=0, stokKeladi=0, stokAlocasia=0; int stokMawar=0;

        for(int i=0;i < stok.length;i++){
            for(int j=0;j < stok[0].length; j++){
                if (j == 0) {
                    stokAglonema += stok[i][j];
                } else if (j == 1) {
                    stokKeladi += stok[i][j];
                } else if (j == 2) {
                    stokAlocasia += stok[i][j];
                } else if (j == 3) {
                    stokMawar += stok[i][j];
                }
            }
        }
        System.out.println("Jumlah Stock Berdasarkan Jenis Bunga di Semua Cabang");
        System.out.println("Stok Aglonema : " + stokAglonema);
        System.out.println("Stok Keladi : " + stokKeladi);
        System.out.println("Stok Alocasia : " + stokAlocasia);
        System.out.println("Stok Mawar : " + stokMawar);

    }
}

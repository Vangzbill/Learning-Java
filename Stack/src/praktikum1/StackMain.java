package praktikum1;
import java.util.Scanner;

public class StackMain {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            Stack stk = new Stack(1);
            char pilih;
            
            while(true){
                System.out.print("Anda ingin melakukan operasi apa? (1.push/2.pop/3.peek/4.print/5.getMin)");
                int operasi = sc.nextInt();
                switch (operasi){
                    case 1:
                        do{
                            sc.nextLine();
                            System.out.print("Jenis: ");
                            String jenis = sc.nextLine();
                            System.out.print("Warna: ");
                            String warna = sc.nextLine();
                            System.out.print("Merk: ");
                            String merk = sc.nextLine();
                            System.out.print("Ukuran: ");
                            String ukuran = sc.nextLine();
                            System.out.print("Harga: ");
                            double harga = sc.nextDouble();
                
                            Pakaian p = new Pakaian(jenis, warna, merk, ukuran, harga);
                            System.out.print("Apakah Anda akan menambahkan data baru ke stack (y/n)? ");
                            pilih = sc.next().charAt(0);
                            sc.nextLine();
                            stk.push(p); 
                        }while (pilih =='y');
                        break;
                    case 2:
                        stk.pop();
                        break;
                    case 3:
                        stk.peek();
                        break;
                    case 4:
                        stk.print();
                        break;
                    case 5:
                        stk.getMin();
                        break;
                    default :
                        System.out.println("Operasi tidak ditemukan");
                        break;
                }
                sc.nextLine();
                System.out.println("Apakah ingin melakukan operasi lain ? (y/n)");
                if(sc.nextLine().equalsIgnoreCase("n"))break;
            }
    }
            
}

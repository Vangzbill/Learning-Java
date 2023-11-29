package minggu5;
import java.util.Scanner;

public class MayoritasMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya suara : ");
        int x = sc.nextInt();
        Mayoritas mayoritas = new Mayoritas(x);
        
        sc.nextLine();
        for (int i = 0; i < mayoritas.voting.length; i++) {
            System.out.print("Masukkan hasil suara ke-" + (i + 1 + " : "));
            mayoritas.voting[i] = sc.nextLine();
        }

        System.out.println("Mayoritas suaranya adalah : " + mayoritas.cariMayoritas(mayoritas.voting, 0, mayoritas.voting.length-1));

    }
}

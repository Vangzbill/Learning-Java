package minggu2;
import java.util.Scanner;
public class Tugas2Main {
    public static void main(String[] args) {
        Tugas2 p1 = new Tugas2(11, 8, 22, 18);
        Scanner sc = new Scanner(System.in);

    p1.printPosition();
        loop:while (true) {
            switch (sc.nextLine()) {
            case "a":
            p1.moveLeft();
            break;
            case "d":
            p1.moveRight();
            break;
            case "w":
            p1.moveUp();
            break;
            case "s":
            p1.moveDown();
            break;
            case "exit":
            break loop;
            default:
            p1.printPosition();
            break;
        }
    }
    
 


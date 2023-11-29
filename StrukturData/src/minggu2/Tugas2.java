package minggu2;

public class Tugas2 {
    int x, y, width, height;

    void moveLeft() {
        if (x > 1) x--;
        printPosition();
    }

    void moveRight() {
        if (x < width-1) x++;
        printPosition();
    }

    void moveUp() {
        if (y > 1) y--;
        printPosition();
    }

    void moveDown() {
        if (y < height-1) y++;
        printPosition();
    }

    void printPosition() {
        for (int i=0; i<=height; i++) {
            for (int j=0; j<=width; j++) {
                if (i==0 || i==height || j==0 || j==width) {
                    System.out.print("# ");
                } else if (i==y && j==x) {
                    System.out.print("C ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
            }
       

    Tugas2() {}
    Tugas2(int xx, int yy, int w, int h) {
    x = xx;
    y = yy;
    width = w;
    height = h;
    }
}


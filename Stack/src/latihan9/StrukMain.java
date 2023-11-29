package latihan9;

public class StrukMain {
    public static void main(String[] args) {
        StackStruk stack = new StackStruk(8);
        stack.push(new StrukBlnja(19, 15, 4, 120000));
        stack.push(new StrukBlnja(27, 16, 3, 75000));
        stack.push(new StrukBlnja(86, 17, 5, 350000));
        stack.push(new StrukBlnja(45, 18, 2, 250000));
        stack.push(new StrukBlnja(26, 19, 8, 500000));
        stack.push(new StrukBlnja(34, 20, 1, 100000));
        stack.push(new StrukBlnja(47, 21, 5, 300000));
        stack.push(new StrukBlnja(70, 22, 8, 200000));

        System.out.println("Struk yang diambil Dewi: ");
        for (int i = 0; i < 5; i++) stack.pop();
            System.out.println("\nIsi stack setelah mengambil 5 struk belanja: ");
            stack.print();
        }
    }

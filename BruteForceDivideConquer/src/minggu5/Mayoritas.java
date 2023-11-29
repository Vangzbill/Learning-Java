package minggu5;

public class Mayoritas {
    String[] voting;
    
    public Mayoritas(int panjang) {
        voting = new String[panjang];
    }

    public String cariMayoritas(String[] voting, int first, int last) {
        if (first == last) {
            return voting[first];
        } else {
            int mid = (first + last) / 2;
            String temp1 = cariMayoritas(voting, first, mid);
            String temp2 = cariMayoritas(voting, mid + 1, last);
            String nm = "No Mayoritas";
            if (temp1.equalsIgnoreCase(nm)) return temp2;
            if (temp2.equalsIgnoreCase(nm)) return temp1;
            return (temp1.equalsIgnoreCase(temp2) ? temp1 : nm);
        }
    }
}

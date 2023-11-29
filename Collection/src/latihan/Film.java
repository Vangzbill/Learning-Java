package latihan;

/**
 *
 * @author sabil
 */
public class Film {
    String id, judul, thntyang, director;

    public Film(String id, String judul, String thntyang, String director) {
        this.id = id;
        this.judul = judul;
        this.thntyang = thntyang;
        this.director = director;
    }
    
    public String toString() {
        return "Film{" + "id=" + id + ", judul=" + judul + ", tahun=" + thntyang + ", director=" + director + '}';
    }

}

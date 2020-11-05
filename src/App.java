/**
 * @author
 * Nim  : 10116430
 * Nama : Wisnu Bayu Aji
 * Kelas: IF-2
 */
public class App {
    public static void main(String[] args) throws Exception {
        
        Mahasiswa kenalan = new Mahasiswa();

        kenalan.nim = "10116430";
        kenalan.nama = "Wisnu Bayu Aji";
        kenalan.perkenalkanDiri(kenalan.nim, kenalan.nama);
        
        kenalan.nim = "10116430";
        kenalan.nama = "Bayu Aji";
        kenalan.perkenalkanDiri(kenalan.nim, kenalan.nama);
        
        kenalan.nim = "10116430";
        kenalan.nama = "Aji";
        kenalan.perkenalkanDiri(kenalan.nim, kenalan.nama);
        
    }
}

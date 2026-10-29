public class Buku {
String kodeBuku, judulBuku, penulisBuku, kategoriBuku; 
Double Harga;

public Buku(String kodeBuku, String judulBuku, String penulisBuku, String kategoriBuku, Double Harga) {
    this.kodeBuku = kodeBuku;
    this.judulBuku = judulBuku;
    this.penulisBuku = penulisBuku;
    this.kategoriBuku = kategoriBuku;
    this.Harga = Harga;
}
void tampilkanBuku() {
    System.out.println("Kode Buku: " + kodeBuku);
    System.out.println("Judul Buku: " + judulBuku);
    System.out.println("Penulis Buku: " + penulisBuku);
    System.out.println("Kategori Buku: " + kategoriBuku);
    System.out.println("Harga Buku: " + Harga);

}
}


public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku("B001", "Power", "Robert Greene","Filsafat", 85000.0);
        Buku buku2 = new Buku("B002", "Bintang", "Tere Liye","Novel", 300000.0);
        Buku buku3 = new Buku("B003", "Laut Bercerita", "Leila S. Chudori","Fiksi", 1500000.0);

        System.out.println("Informasi Buku 1:");
        buku1.tampilkanBuku();
        System.out.println();

        System.out.println("Informasi Buku 2:");
        buku2.tampilkanBuku();
        System.out.println();

        System.out.println("Informasi Buku 3:");
        buku3.tampilkanBuku();
    }

}

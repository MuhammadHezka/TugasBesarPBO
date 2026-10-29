public class Menu{
    private String kodeMenu;
    private String namaMenu;
    private double harga;
    private String kategori;

    public Menu() {
        this.kodeMenu = "M00";
        this.namaMenu = "Menu belum diisi";
        this.harga = 0;
        this.kategori = "Umum";
    }

    public Menu(String kodeMenu, String namaMenu, double harga, String kategori) {
        this.kodeMenu = kodeMenu;
        this.namaMenu = namaMenu;
        this.harga = harga;
        this.kategori = kategori;
    }

    public double hitungHarga(int jumlah) {
        return harga * jumlah;
    }

    public void tampilMenu() {
        System.out.println("Kode    : " + kodeMenu);
        System.out.println("Nama    : " + namaMenu);
        System.out.println("Kategori: " + kategori);
        System.out.println("Harga   : Rp" + harga);
    }

}

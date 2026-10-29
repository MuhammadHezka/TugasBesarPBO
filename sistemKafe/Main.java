public class Main{
    public static void main(String[] args) {
        Menu menu1 = new Menu("M001", "Nasi Goreng", 18000, "Makanan");
        int jumlahPesanan = 2;

        menu1.tampilMenu();
        System.out.println("Jumlah pesanan: " + jumlahPesanan);
        System.out.println("Total harga   : Rp" + menu1.hitungHarga(jumlahPesanan));

     
    }
}
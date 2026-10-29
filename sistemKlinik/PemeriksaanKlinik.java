package sistemKlinik;
public class PemeriksaanKlinik {
private String noPemeriksaan, namaPasien, namaDokter;
private double biayaPemeriksaan;

public PemeriksaanKlinik(String noPemeriksaan, String namaPasien, String namaDokter, double biayaPemeriksaan) {
    this.noPemeriksaan = noPemeriksaan;
    this.namaPasien = namaPasien;
    this.namaDokter = namaDokter;
    this.biayaPemeriksaan = biayaPemeriksaan;
}
public double hitungTotalBiaya(int jumlahPemeriksaan) {
    return biayaPemeriksaan * jumlahPemeriksaan;
}

public void tampilPemeriksaan() {
    System.out.println("No Pemeriksaan : " + noPemeriksaan);
    System.out.println("Nama Pasien    : " + namaPasien);
    System.out.println("Nama Dokter    : " + namaDokter);
    System.out.println("Biaya Pemeriksaan: Rp" + biayaPemeriksaan);
}
}

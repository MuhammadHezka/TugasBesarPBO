package sistemKlinik;
import java.util.ArrayList;
public class Main {
public static void main(String[] args) {
    ArrayList<PemeriksaanKlinik> daftarPemeriksaan = new ArrayList<>();
    daftarPemeriksaan.add(new PemeriksaanKlinik("P001", "Dapuy", "Dr. Hezka", 50000));
    daftarPemeriksaan.add(new PemeriksaanKlinik("P002", "Shelvy", "Dr. priaSolo", 100000));
    daftarPemeriksaan.add(new PemeriksaanKlinik("P003", "Rizki", "Dr. Naufal", 60000));   
  
    double totalBiaya = 0;
    for (PemeriksaanKlinik pemeriksaan : daftarPemeriksaan) {
        pemeriksaan.tampilPemeriksaan();
        totalBiaya += pemeriksaan.hitungTotalBiaya(1);
        System.out.println();
    }
    System.out.printf("Total Biaya: Rp%.0f%n", totalBiaya);
}
}

public class Main {
public static void main(String[] args) {
        Sepeda sepeda1 = new Sepeda("KS001", "Gunung", 3, 15000.0);
        Sepeda sepeda2 = new Sepeda("KS002", "Balap", 5, 20000.0);
        Sepeda sepeda3 = new Sepeda("KS003", "Listrik", 2, 25000.0);

        System.out.println("Informasi Sepeda 1:");
        sepeda1.tampilData();
        System.out.println();

        System.out.println("Informasi Sepeda 2:");
        sepeda2.tampilData();
        System.out.println();

        System.out.println("Informasi Sepeda 3:");
        sepeda3.tampilData();
    }
}

import java.util.Scanner;
public class Tugas3_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahToko = 0;

        while (true) {
            System.out.print("Masukkan jumlah toko (minimal 1): ");
            jumlahToko = sc.nextInt();

            if (jumlahToko >= 1) {
                break;
            }
            System.out.println("Jumlah toko minimal 1. Silakan masukkan ulang.");
        }

        int totalBarang = 0;
        int maxBarang = -1;
        int tokoTerbanyak = 0;

        for (int i = 1; i <= jumlahToko; i++) {
            int jumlahPelanggan = 0;
            while (true) {
                System.out.print("Masukkan jumlah pelanggan untuk Toko " + i + " (tidak boleh negatif): ");
                jumlahPelanggan = sc.nextInt();
                if (jumlahPelanggan >= 0) {
                    break;
                }
                System.out.println("Jumlah pelanggan tidak boleh negatif.");
            }

            int totalBarangToko = 0;
            for (int j = 1; j <= jumlahPelanggan; j++) {
                int jumlahBarang = 0;
                while (true) {
                    System.out.print(" - Masukkan jumlah barang yang dibeli pelanggan ke-" + j + " (tidak boleh negatif): ");
                    jumlahBarang = sc.nextInt();
                    if (jumlahBarang >= 0) {
                        break;
                    }
                    System.out.println(" - Jumlah barang tidak boleh negatif.");
                }
                totalBarangToko += jumlahBarang;
            }
            totalBarang += totalBarangToko;
            System.out.println("Toko" + i + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko);

            if (totalBarangToko > maxBarang) {
                maxBarang = totalBarangToko;
                tokoTerbanyak = i;
            }
            System.out.println();
        }
        System.out.println("Total barang seluruh toko: " + totalBarang);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);

        sc.close();
    }
}
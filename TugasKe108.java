import java.util.Scanner;

public class TugasKe108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int tiket = 50000, jumlahTiket, totalTiket = 0, totalHarga = 0;
        double harga,  diskon;

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik 0 untuk selesai): ");
            jumlahTiket = sc.nextInt();
            // memeriksa apabila jumlah tiket yang diinputkan tidak valid
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan jumlah tiket yang valid!");
                continue;
            // memeriksa apakah pemesanan tiket telah selesai
            } else if (jumlahTiket == 0) {
                System.out.println("Pemesanan tiket selesai");
                break;
            }

            if (jumlahTiket > 10) {
                diskon = 0.15; 
                harga = (tiket * jumlahTiket) * diskon;
            } else if (jumlahTiket > 4) {
                diskon = 0.10; 
                harga = (tiket * jumlahTiket) * diskon;
            } else{
                diskon = 0.00;
                harga = tiket * jumlahTiket;
        }
        totalTiket += jumlahTiket;
        totalHarga += harga;

        System.out.println("Total tiket yang harus dibayar: " + (int) harga);

        } while (true);
        
        System.out.println("Jumlah tiket yang dibeli sebanyak: " + totalTiket);
        System.out.println("Total tiket yang harus dibayar: " + (int) totalHarga);
    }

}
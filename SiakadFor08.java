import java.util.Scanner;

/**
 * SiakadFor08
 */
public class SiakadFor08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidakLulus = 0;

        // inisialisasi ; kondisi ; update
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            // menentukan nilai tertinggi
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            // menentukan nilai terendah
            if (nilai < terendah) {
                terendah = nilai;
            }

            // menentukan kelulusan siswa
            if (nilai >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Mahasiswa Lulus : " + lulus);
        System.out.println("Mahasiswa Lulus : " + tidakLulus);

    }

} // belum di push habis modifikasi
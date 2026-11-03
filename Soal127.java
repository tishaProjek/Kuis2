// Nama : Tisha Ivana
// NIM : 264107060129
// Kelas : SIB - 1D
// Paket Soal : Kode A

import java.util.Scanner;

public class Soal127 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int nilai;
        int totalNilai = 0;
        int nilaiTertinggi = 0;
        int nilaiTerendah = 0;
        int lulus = 0;
        int tidakLulus = 0;
        double rata;

        System.out.print("Jumlah mahasiswa : ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            do {
                System.out.print("Nilai mahasiswa ke-" + i + " : ");
                nilai = sc.nextInt();

                if (nilai < 0 || nilai > 100) {
                    System.out.println("Nilai harus 0-100. Ulangi input!");
                }

            } while (nilai < 0 || nilai > 100);

            totalNilai += nilai;

            if (i == 1) {
                nilaiTertinggi = nilai;
                nilaiTerendah = nilai;
            } else {
                if (nilai > nilaiTertinggi) {
                    nilaiTertinggi = nilai;
                }

                if (nilai < nilaiTerendah) {
                    nilaiTerendah = nilai;
                }
            }

            if (nilai >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }

        rata = (double) totalNilai / n;

        System.out.println("Rata-rata : " + rata);
        System.out.println("Nilai tertinggi : " + nilaiTertinggi);
        System.out.println("Nilai terendah : " + nilaiTerendah);
        System.out.println("Lulus (>= 60) : " + lulus);
        System.out.println("Tidak lulus : " + tidakLulus);

        sc.close();
    }
}
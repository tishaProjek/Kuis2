// Nama : Tisha Ivana
// NIM : 264107060129
// Kelas : SIB - 1D
// Paket Soal : Kode A

import java.util.Scanner;

public class Soal127 {
    public static void main(String[] args) {
        double rata = 0, tidakLulus = 0, lulus = 0, nilaiTerendah = 60, nilaiTertinggi = 100;
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
            System.out.print("Masukkan nilai mahasiswa ke-" + n + " : ");
            double nilai = sc.nextDouble();
        do {
            
            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai harus antara 0 dan 100. Silakan masukkan kembali.");
                continue;
            }
            if (n == 1) {
                nilaiTerendah = nilai;
                nilaiTertinggi = nilai;
            } else {
                if (nilai < nilaiTerendah) {
                    nilaiTerendah = nilai;
                }
                if (nilai > nilaiTertinggi) {
                    nilaiTertinggi = nilai;
                }
            }
            rata += nilai;
            if (nilai < 60) {
                tidakLulus++;
            } else {
                lulus++;
            }
            n++;
        } while (n <= 10);
        rata /= 10;
        System.out.println("Rata-rata: " + rata);
        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        System.out.println("Lulus: " + lulus);
        System.out.println("Tidak Lulus: " + tidakLulus);
    }
}

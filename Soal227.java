// Nama : Tisha Ivana
// NIM : 264107060129
// Kelas : SIB - 1D
// Paket Soal : Kode A

import java.util.Scanner;

public class Soal227 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahKantin, jumlahHari = 0, jumlahToko, pendapatan;

        double totalHarga;
        int i = 0;
        do {
            System.out.print("Jumlah Kantin: ");
            jumlahKantin = sc.nextInt();
            System.out.print("Jumlah hari: ");
            jumlahHari = sc.nextInt();

            System.out.println("PENDAPATAN HARI KE-" + jumlahHari);
            jumlahHari = sc.nextInt();

        } while (jumlahKantin <= 0 || jumlahHari <= 0);

        int kantinTerbaik = 0;
        int hariSepi = 0;
        while (i < jumlahKantin) {

            int jumlahPelanggan;
            do {
                System.out.print("Pendapatan Hari ke " + i + ": ");
                pendapatan = sc.nextInt();

                if (pendapatan < 0) {
                    System.out.println("Pendapatan tidak boleh negatif!");
                }
            } while (pendapatan < 0);

            if (i == 0 || pendapatan > kantinTerbaik) {
                kantinTerbaik = pendapatan;
            }

            int j = 1;

            while (j <= pendapatan) {

                int jumlahBarang;

                do {
                    System.out.print("Jumlah barang pelanggan " + j + ": ");
                    jumlahBarang = sc.nextInt();

                    if (jumlahBarang < 0) {
                        System.out.println("Jumlah barang tidak boleh negatif!");
                    }
                } while (jumlahBarang < 0);

                j++;
            }

            i++;
        }

        System.out.println("Kantin Terbaik: " + kantinTerbaik);
        System.out.println("Hari sepi (<100): " + hariSepi);

        sc.close();
    }
    
}

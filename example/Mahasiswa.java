package org.example;

public class Mahasiswa {
    String nama, nim, jurusan;
    static String universitas = "Universitas Muhammadiyah Malang";

    Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    static String tampilUniversitas() {
        return universitas;
    }

    static Mahasiswa[] daftarMahasiswa = new Mahasiswa[100];
    static int jumlahMahasiswa = 0;

    public static void addDaftarMahasiswa(String nama, String nim, String jurusan) {
        if (jumlahMahasiswa < daftarMahasiswa.length) {
            Mahasiswa mhswBaru = new Mahasiswa(nama, nim, jurusan);
            daftarMahasiswa[jumlahMahasiswa] = mhswBaru;
            jumlahMahasiswa++;
            System.out.println("Data mahasiswa berhasil ditambahkan.");
        } else {
            System.out.println("Kapasitas data mahasiswa penuh.");
        }
    }

    public static void tampilDataMahasiswa() {
        if (jumlahMahasiswa == 0) {
            System.out.println("Belum ada data mahasiswa yang dimasukkan.");
        } else {
            System.out.println("Data Mahasiswa:");
            System.out.println( tampilUniversitas());
            for (int i = 0; i < jumlahMahasiswa; i++) {
                System.out.println("Nama: " + daftarMahasiswa[i].nama + ", NIM: " + daftarMahasiswa[i].nim + ", Jurusan: " + daftarMahasiswa[i].jurusan);
            }
        }
    }
}
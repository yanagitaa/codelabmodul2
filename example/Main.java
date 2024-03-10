package org.example;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("Menu:");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");
            int pilihmenu = input.nextInt();

            switch (pilihmenu){
                case 1:
                    System.out.print("Masukkan nama Mahasiswa\t\t: ");
                    input.nextLine();
                    String NIM = input.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa\t\t: ");
                    String NIIM = input.nextLine();
                    while (NIIM.length() != 15){
                        System.out.println("Nim Harus 15 Digit!!!");
                        System.out.print("Masukkan NIM Mahasiswa\t\t: ");
                        NIIM = input.nextLine();
                    }
                    System.out.print("Masukkan jurusan Mahasiwa\t: ");
                    String jrsn = input.nextLine();
                    Mahasiswa.addDaftarMahasiswa(NIM, NIIM, jrsn);
                    break;
                case 2:
                    Mahasiswa.tampilDataMahasiswa();
                    break;
                case 3:
                    System.out.print("Adios");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Tidak Valid Coba Lagi.");
            }
        }
    }
}
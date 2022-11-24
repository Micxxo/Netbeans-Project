/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesi7;

import java.util.Scanner;

/**
 *
 * @author INFINIX
 */
public class kota {
    public static void main(String[] args) {
//        jumlah pengguna kendaraan
//    jumlah jenis kendaraan dari beberapa kota.
//Semua variable diinput oleh user dan disimpan dalam bentuk array.
       Scanner scanner = new Scanner(System.in);
       int jumlahKota, jeniKendaraan;
       
    System.out.println("\n---------- PENGGUNA KENDARAAN ----------");
    System.out.print("Input jumlah kota: ");
    jumlahKota = scanner.nextInt();

    System.out.print("Ada berapa jenis kendaraan: ");
    jeniKendaraan = scanner.nextInt();
    scanner.nextLine(); // read newline

    String[] kota = new String[jumlahKota];
    System.out.println("\n---------- KOTA ----------");
    for (int i = 0; i < jumlahKota; i++) {
      System.out.print("Masukkan nama kota ke-" + (i + 1) + ": ");
      kota[i] = scanner.nextLine();
    }

    String[] jenisKendaraan = new String[jeniKendaraan];
    System.out.println("\n---------- JENIS KENDARAAN ----------");
    for (int i = 0; i < jumlahKota; i++) {
      System.out.print("Masukkan jenis kendaraan ke-" + (i + 1) + ": ");
      jenisKendaraan[i] = scanner.nextLine();
    }

    int[][] jumlahKendaraan = new int[jumlahKota][jeniKendaraan];
    for (int i = 0; i < jumlahKota; i++) {
      System.out.println("\n---------- " + kota[i].toUpperCase() + " ----------");
      for (int j = 0; j < jeniKendaraan; j++) {
        System.out.print("Jumlah kendaraan " + jenisKendaraan[j] + " di Kota " + kota[i] + ": ");
        jumlahKendaraan[i][j] = scanner.nextInt();
      }
    }

    int[] totalKendaraan = new int[jeniKendaraan];
    int totalSemua = 0;
    System.out.println("\n---------- HASIL ----------\n");
    for (int i = 0; i < jumlahKota; i++) {
      System.out.println("--2 Kota " + kota[i]);
      int totalKota = 0;
      for (int j = 0; j < jeniKendaraan; j++) {
        System.out.println(jenisKendaraan[j] + ": " + jumlahKendaraan[i][j]);
        totalKota += jumlahKendaraan[i][j];
        totalKendaraan[i] += jumlahKendaraan[j][i];
      }
      totalSemua += totalKota;
      System.out.println("total: " + totalKota);
      System.out.print("\n");
    }

    System.out.println("\n----------------JUMLAH KENDARAAN --------------\n");
    for (int i = 0; i < jeniKendaraan; i++) {
      System.out.println(jenisKendaraan[i] + ": " + totalKendaraan[i]);
    }
    System.out.println("Total semua: " + totalSemua);

    scanner.close();
  }
}




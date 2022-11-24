/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tes_java;
import java.util.Scanner;
/**
 *
 * @author INFINIX
 */
import java.util.Scanner;

public class Kasir {
    
    public static void main(String[] args) {
        Pelanggan myPelanggan = new Pelanggan();
        Makanan myMakanan = new Makanan();

        myMakanan.menuMakanan();
        myPelanggan.pesan();
        myPelanggan.pembelian();
    }
    
}


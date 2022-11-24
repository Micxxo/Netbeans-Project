/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.micosesi2;

/**
 *
 * @author INFINIX
 */
class Kotak {
    double panjang, lebar, tinggi;
}

class DemoKotak1  {
    public static void main(String[] args) {
        double volume;
        Kotak k = new Kotak();
        
//        Mengisikan nilai kedalam data-data Kotak
        k.panjang = 4;
        k.lebar = 3;
        k.tinggi= 2;
        
//        Menghitung isi volume kotak
        volume = k.panjang * k.tinggi * k.lebar;
        
//        Menampilkan niai volume
        System.out.println("Volume Kotak = " + volume);
    }
}

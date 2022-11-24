/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.micosesi2;

/**
 *
 * @author INFINIX
 */
class DemoKotak2 {
    public static void main(String[] args) {
        
        double volume1, volume2;
       
        Kotak k1 = new Kotak(); // Mendklarasikan objek k1
        Kotak k2 = new Kotak(); //  Mendeklarasikan objek k2
        
//        Mengisikan nilai ke dalam objek k1
        k1.panjang =4;
        k1.lebar = 3;
        k1.tinggi = 2;
        
//        Mengisikan nilai ke dalam objek k2
        k2.panjang = 6;
        k2.lebar = 5;
        k2.tinggi = 4;
        
//        Menghitung volume dari objek k1
        volume1 = k1.panjang * k1.tinggi * k1.lebar ;
        
//        Menghitung volume dari objek k1
        volume2 = k2.panjang * k2.tinggi * k2.lebar;
        
//        Menampilkan nilai k1 dan k2 di monitor
        System.out.println("Volume k1 = "+ volume1);
        System.out.println("Volume k2 = "+ volume2);

    }
}

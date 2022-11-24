/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.micosesi2;

/**
 *
 * @author INFINIX
 */
class Balok {
    double panjang, lebar, tinggi;
    
//    Mendefinisikan method dengan parameter
    void isiData(double p, double l, double t) {
        panjang = p;
        lebar = l;
        tinggi= t;
    }
   double hitungVolume(){
       return(panjang * lebar * tinggi);
   }
}

class DemoMethod3 {
    public static void main(String[] args) {
        Balok k;
//        instansiasi objek
        k = new Balok();
        
//        memanggil method isiData
        k.isiData(4,3,2);
        
        System.out.println("Volume Kotak = "+ k.hitungVolume());
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studikasus;

/**
 *
 * @author INFINIX
 */
class  limasSegitiga {
    double  LA, TL;


void isiData( double L, double T){
     LA = L;
     TL = T;
}

double hitungVolume() {
     return (LA * TL / 3); 
}
}

class DemoMethod3 {
    public static void main(String[] args) {
        limasSegitiga l;
        l = new limasSegitiga();
        l.isiData(  3, 8);
        
        System.out.println("Volume Limas Segitiga = " + l.hitungVolume());
    }
}
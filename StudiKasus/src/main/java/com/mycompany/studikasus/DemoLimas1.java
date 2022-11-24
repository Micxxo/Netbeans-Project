/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studikasus;

/**
 *
 * @author INFINIX
 */
class limasSegitiga {
    double  LA, TL;
}

public class DemoLimas1 {
    public static void main(String[] args) {
        double volume;
        limasSegitiga l = new limasSegitiga();
        
        l.LA = 10;
        l.TL = 4;
        
        volume = 1.0/3.0 * l.LA * l.TL;
        
        System.out.println("Volume Limas Segitiga = " + volume);
    }
}

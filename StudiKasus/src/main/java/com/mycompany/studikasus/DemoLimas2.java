/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studikasus;

/**
 *
 * @author INFINIX
 */
public class DemoLimas2 {
    public static void main(String[] args) {
        double volume1, volume2;
        
        limasSegitiga l1 = new limasSegitiga();
        limasSegitiga l2 = new limasSegitiga();
        
        l1.LA = 10;
        l1.TL = 6;
        
        l2.LA = 5;
        l2.TL = 2;
        
        volume1 = 1.0/3.0 * l1.LA * l1.TL;
        volume2 = 1.0/3.0 * l2.LA * l2.TL;

        System.out.println("Volume l1 = " +volume1);
        System.out.println("Volume l2 = " +volume2);

    }
}
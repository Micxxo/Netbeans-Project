/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studikasus;
import java.util.Scanner;
/**
 *
 * @author INFINIX
 */
public class LuasSegitigaTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Alas = ");
        double alas = input.nextDouble();
        System.out.println("Masukan Tinggi = ");
        double tinggi = input.nextDouble();
        
        LuasSegitiga segitiga = new LuasSegitiga();
        segitiga.setAlas(alas);
        segitiga.setTinggi(tinggi);
        
        System.out.println("");
        System.out.println("Alas  : "+segitiga.getAlas());
        System.out.println("Tinggi   :"+segitiga.getTinggi());
        System.out.println("Luas  :"+segitiga.HitungVolume());
    }
}

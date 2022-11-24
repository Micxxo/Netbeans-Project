/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesi1mico;
import java.util.Scanner;
/**
 *
 * @author INFINIX
 */
public class LuasSegitigaTester {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan alas :  ");
        double alas  = input.nextDouble();
        System.out.print("Masukan Tinggi :  ");
        double tinggi = input.nextDouble();
        
        LuasSegitiga meja = new LuasSegitiga();
        meja.setAlas(alas);
        meja.setTinggi(tinggi);
        
        System.out.println("");
        System.out.println("Alas   : "+meja.getAlas());        
        System.out.println("Tinggi  :"+meja.getTinggi());
        System.out.println("Luas  :"+meja.HitungLuas());
    }

}
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
public class Challenge1Case1Tester {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Panjang :  ");
        double panjang  = input.nextDouble();
        System.out.print("Masukan Lebar :  ");
        double lebar = input.nextDouble();
        System.out.print("Masukan Tinggi :  ");
        double tinggi = input.nextDouble();

        
        Challenge1Case1 meja = new Challenge1Case1();
        meja.setPanjang(panjang);
        meja.setLebar(lebar);
        meja.setTinggi(tinggi);
        
        System.out.println("");
        System.out.println("Panjang   : "+meja.getPanjang());
        System.out.println("Lebar   :"+meja.getLebar());
        System.out.println("Tinggi  :"+meja.getTinggi());
        System.out.println("Volume  :"+meja.HitungVolume());
    }

    }


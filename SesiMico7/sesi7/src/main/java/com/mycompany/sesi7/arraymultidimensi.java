/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesi7;

/**
 *
 * @author INFINIX
 */
public class arraymultidimensi {
    public static void main(String[] args) {
//        Elemen 512 x 128 dari integer array
          int [][] twoD = new int [512] [128];
//          Karakter array 8 x 16 x 24
          char [][][] threeD = new char [8][16][24];
//          String array 4 baris x 2 kolom 
          String [] [] dogs = {{ "terry", "brown" }, {"kristin", "white"}, {"toby", "gray"}, {"fido", "black"}};
          System.out.println(dogs[0][0]);
    }
}

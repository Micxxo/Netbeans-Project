/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesi7;

/**
 *
 * @author INFINIX
 */
public class Haridalamseminggu {
    public static void main(String[] args) {
        
    String hari[] = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
    int i = 0;
    int z = 0;
    int x = 0;
    
    System.out.println("Dengan while = ");
   while(i < hari.length) {
            System.out.println("Sekarang adalah hari " + hari[i]);
            i++;
    }
   
        System.out.println("\n");
   
        System.out.println("Dengan Do while = ");
   do {
        System.out.println("Sekarang adalah hari " + hari[z]);
        z++;
  }
    while(z < hari.length);
   
    System.out.println("\n");
        System.out.println("Dengan for = ");
    for (x=0; x<hari.length; x++){
       System.out.println("Sekarang adalah hari " + hari[x]);
   }
}
  
}


    
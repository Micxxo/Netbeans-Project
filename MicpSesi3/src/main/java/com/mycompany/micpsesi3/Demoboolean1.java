/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.micpsesi3;

/**
 *
 * @author INFINIX
 */
 class Demoboolean1 {
     public static void main(String[] args) {
         boolean b;
         
         b = true;
         System.out.println("Nilai b = " + b);
         
         if (b) {
             System.out.println("Statemen ke-1 dieksekusi");
         }
         
         b = false ;
         System.out.println("Nilai b = " + b);
         
         if (b) {
             System.out.println("Statemen ke-2 tidk akan dieksekusi");
         }
         if(!b) {
             System.out.println("Statemen ke-3 dieksekusi");
         }
         
         System.out.println("5 <= 10 mengembalikan nilai " + (5 <= 10));
         System.out.println("4 > 6 mengembalikan nilai " + (4 > 6));
     }
}

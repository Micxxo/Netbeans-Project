/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesi6;

/**
 *
 * @author INFINIX
 */
 class DemoFor1 {
     public static void main(String[] args) {
         int n = 11;
         int hasil = 0;
         for (int i=1; i<=n; i++) {
             hasil += i;
             if (i != n) {
             System.out.println(i + "+");
         }else {
                 System.out.println(n);
                 System.out.println("= ");
             }
         }
         System.out.println(hasil);
     }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesi6;

/**
 *
 * @author INFINIX
 */
 class DemoForPrima {
     public static void main(String[] args) {
         int bilangan = 9;
         boolean prima = true;
         for (int i=2; i <= (bilangan/2); i++) {
             if ((bilangan % 1)== 0) {
                 prima = false;
                 break; //menghentikan perulangan
             }
         }
         if (prima) {
             System.out.println(bilangan + " merupakan bilangan prima");
         }else {
             System.out.println(bilangan + " bukan bilangan prima");
         }
     }
}

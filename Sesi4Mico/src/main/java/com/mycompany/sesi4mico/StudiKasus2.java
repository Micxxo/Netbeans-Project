/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesi4mico;
import java.util.Scanner; 
/**
 *
 * @author INFINIX
 */
public class StudiKasus2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.println("Silahkan input angka satuan Kilometer yg akan di konversi: ");
        int KM = input.nextInt();
        
        int total = KM * 1000;
        
        System.out.println("Hasil nya yaitu " + KM + " KM " + " = " + total + " Meter"); 
    }
}

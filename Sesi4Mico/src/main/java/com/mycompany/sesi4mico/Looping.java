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
public class Looping {
    
    public static void main(String[] args) {
        System.out.println("Program Pengulangan Dan Penjumlahan");
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Berapa kali perulangan akan dilakukan : ");
        int n = input.nextInt();
        int k = 1, total = 1;
        
        for (int i = 1; i <= n; i++){
            System.out.println("Ini adalah catatan ke" + i + " , total nilai saya adalah " + total);
        }
    }
    
}
